(ns leetcode.array-easy)
;https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
(defn kids-with-the-greatest-number-of-candies
   "docstring"
   [arr n]
  ;find the max element
   (def m (reduce max arr))
   (letfn [(greatest-x [i]
            (>= (+ i n)  m) )
           ]
     (map greatest-x arr)
    )
  )


(println (kids-with-the-greatest-number-of-candies [2,3,5,1,3] 3))