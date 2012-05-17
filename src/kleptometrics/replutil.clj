(ns kleptometrics.replutil
  (:require [kleptometrics.handler])
  (:use [ring.util.serve]))


(defn serve-it []
  (serve kleptometrics.handler/app)) 
