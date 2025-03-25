(ns greet.main)

(defn greet [who]
  (printf "Hello %s!%n" who)
  (flush))

(defn -main [& args]
  (greet (or (first args) "world")))
