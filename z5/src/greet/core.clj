(ns greet.core)

(defn greet [who]
  (printf "Heyo %s!%n" who)
  (flush))
