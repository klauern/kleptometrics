# job-librarian

Job Librarian is a Clojure toy project that hopefully will scratch an itch I've
had with an application I'm maintaining at work.  It's purpose is to:

  * manage job runs
  * track timing
  * ...and failed
  * ...and delayed jobs

## Background

There are a multitude of metrics libraries out there, but they all seem to focus
on one aspect or another of your app.  [Metrics][http://metrics.codahale.com]
provides some of this work, but at the same time, it's in the context of a running
application with services that you'd like to monitor.

Tools like Nagios, Munin, Pingdom, etc., all provide some very small part of this,
too, but they don't track a multitude of jobs.

What I want to provide should be different:

  * allows you to plug in via a simple HTTP API (RESTful, or REST-like)
  * allows you to monitor many many types of jobs
  * Monitors many of the timings of jobs, such as
    - High, Low, Median run times
    - Peak points, low points, etc.
    - Historical comparison of jobs

The back-end of this system should be pluggable, as I don't know what would work
best yet for storing and providing the metrics for a lot of services as they run.
  - MongoDB? for documents, I could use this for storing multiple runs, by opening
    the document and adding some more runs to it
  - Redis seems flexible enough to provide some of these metrics in real-time,
    and the API is easy enough to work with
  - I thought about Neo4j to tie in associations, but this doesn't seem very
    relationsal, so this one is not a likely candidate
  - RDBMS would fit the bill for storing this data, but providing the ongoing
    ESP-like tracking of job runs seems not it's game...
  - Datomic seems possible, too, but I don't have any intention of buying a
    database backend for this hobby project (maybe if it proved really useful)

I've not yet evaluated the backend for this system, but it's likely going to have
to be open-ended.

## Usage

TBD (this isn't written yet)

## License

Copyright © 2012 Nick Klauer

Distributed under the Eclipse Public License, the same as Clojure.
