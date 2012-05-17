(ns kleptometrics.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (route/not-found "Not Found")
  (POST "/logentry" [request])
  )

(defonce events (atom {}))

(def app
  (handler/site app-routes))

(defn add-entry
  "Add an event entry to the system"
  [entry]
  (swap! assoc events (:id entry) entry))