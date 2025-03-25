(ns greet.core)

(defn greet [who excite?]
  (let [msg (if excite?
              (format "Hello %s!" who)
              (format "Hello %s" who))]
    (println msg)))
