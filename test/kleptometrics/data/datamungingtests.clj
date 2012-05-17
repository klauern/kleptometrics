(ns kleptometrics.data.datamungingtests
  (:require [kleptometrics.json.datatypes :as d])
  (:use [midje.sweet]))

(fact "valid JSON is parsed as valid JSON"
  (d/valid? "{ id: name}") => false)
