(ns greet.main
  (:require [greet.core :as g])
  (:gen-class))

(defn -main [& args]
  (g/greet (or (first args) "world")))
