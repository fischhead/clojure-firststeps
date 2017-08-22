(ns clojure2.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn my-func
  "This is the documentation of my famous new function"
  [arg-a arg-b]
  (println "adding a and b results in: " (+ arg-a arg-b))
  )
(my-func 1 2)
(def abc "abcdefghijklmnopqrstuvxyz")
(println abc)
(def rot13 "mnopqrstuvxyzabcdefghijkl")
(def encoding "mnopqrstuvxyzabcdefghijkl")
(use '[clojure.string :only [index-of]])
(index-of abc "a")
(index-of abc "f")
(def alphabet "abcdefghijklmnopqrstuvxyz")
(index-of alphabet "f")
(get encoding (index-of alphabet "f"))
(get encoding (index-of alphabet "a"))
(defn
  "Encodes a single character in rot13 fashion"
  [the-char]
  (get encoding (index-of alphabet the-char))
  RuntimeException EOF while reading, starting at line 1  clojure.lang.Util.runtimeException (Util.java:221)
  (defn
    "Encodes a single character in rot13 fashion"
    [the-char]
    (get encoding (index-of alphabet the-char))
    )
  (defn
    "Encodes a single character in rot13 fashion"
    [my-char]
    (get encoding (index-of alphabet my-char))
    )
  IllegalArgumentException First argument to defn must be a symbol  clojure.core/defn--4387 (core.clj:294)
  (defn encode-char
    "Encodes a single character in rot13 fashion"
    [my-char]
    (get encoding (index-of alphabet my-char))
    )
  (defn rot13
    "implements rot13 cypher"
    [text]
    (map encode-char "helloworld"))
  (defn rot13
    "implements rot13 cypher"
    [text]
    (map encode-char text))
  (rot13 "hello")
  (defn encode-char
    "Encodes a single character in rot13 fashion"
    [^Character my-char]
    (get encoding (index-of alphabet my-char))
    )
  ; here is a little test
  (rot13 "hello")
