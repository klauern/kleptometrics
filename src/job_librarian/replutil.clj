(ns job-librarian.replutil
  (:require [job-librarian.handler])
  (:use [ring.util.serve]))

(serve job-librarian.handler/app)