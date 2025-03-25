(ns greet.main
  (:gen-class)
  (:require [clojure.tools.cli :as cli])
  (:import [com.picosoft.greet Greeter]))

(def cli-options [["-x" "--excite" "Show some excitement"
                   :default false]])

(defn- parse-args [args]
  (let [{:keys [options arguments errors]} (cli/parse-opts args cli-options)]
    (if (seq errors)
      (binding [*out* *err*]
        (doseq [err errors]
          (println err))
        (System/exit 1))
      {:who (or (first arguments) "world")
       :excite (:excite options)})))

(defn -main [& args]
  (let [{:keys [who excite]} (parse-args args)
        g (Greeter.)]
    (.greet g who excite)))
