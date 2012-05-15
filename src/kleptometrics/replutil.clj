(ns kleptometrics.replutil
  (:require [job-librarian.handler])
  (:use [ring.util.serve]))

(serve kleptometrics.handler/app)