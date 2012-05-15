(ns kleptometrics.app
  (:require [ring.adapter.jetty :as jetty]
            [kleptometrics.handler :as handler])
  (:use [ring.util.serve]))

(defn -main
  "I don't do a whole lot."
  [& args]
  (serve handler/app))
