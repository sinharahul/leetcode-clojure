(ns leetcode.topk-most-frequent)
;https://leetcode.com/problems/top-k-frequent-elements/
(defn most-frequent-n [n items]
  (->> items
       frequencies
       (sort-by val)
       reverse
       (take n)
       (map first)))
(println (most-frequent-n 2 [ 1 1 1 2 2 3]))