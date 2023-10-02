(ns build
  (:require [clojure.tools.build.api :as b]))

(defn uber [_]
  (let [basis (b/create-basis)
        output-dir "target/uber"]
    (b/javac {:basis basis
              :src-dirs ["java/src"]
              :class-dir output-dir})
    (b/compile-clj {:basis basis
                    :class-dir output-dir
                    :src-dirs ["clojure/src"]})
    (b/uber {:uber-file "target/greeter-standalone.jar"
             :class-dir output-dir
             :basis basis
             :main 'greet.main})))

(defn clean [_]
  (b/delete {:path "target"}))
