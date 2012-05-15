(ns kleptometrics.replutil
  (:require [kleptometrics.handler])
  (:use [ring.util.serve]))

(serve kleptometrics.handler/app)