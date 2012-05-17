(ns kleptometrics.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (POST "/logentry" [request])
  (route/not-found "Not Found"))

(defonce events (atom {}))

(def app
  (handler/site app-routes))

(defn add-entry
  "Add an event entry to the system"
  [entry]
  (swap! assoc events (:id entry) entry))
