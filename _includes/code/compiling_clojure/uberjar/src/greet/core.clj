(ns greet.core)

(defn greet [who]
  (printf "Hello %s!%n" who)
  (flush))
