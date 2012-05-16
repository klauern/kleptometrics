(ns kleptometrics.data.datamungingtests
  (:require [kleptometrics.json.datatypes :as d])
  (:use [midje.sweet]))

(fact
  (d/valid? "{ id: name}") => false)

