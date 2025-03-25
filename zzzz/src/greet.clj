(ns greet)

(gen-class
 :name "greet.Greeter"
 :prefix "greeter-"
 :state "message"
 :init "init"
 :constructors {[String] []}
 :methods [[greet [] void]])

(defn- greeter-init [message]
  [[] message])

(defn- greeter-greet [this]
  (println (str "Hello " (.message this) "!")))

(gen-class
 :name "greet.main"
 :prefix "-"
 :main true)

(defn -main [& args]
  (let [g (greet.Greeter. (or (first args) "world"))]
    (.greet g)))
