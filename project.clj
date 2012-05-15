(defproject kleptometrics "1.0.0-SNAPSHOT"
  :description "A metrics-gathering thingy for multiple jobs"
  :url "https://github.com/klauern/kleptometrics.git"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.0.4"]
                 [ring-serve "0.1.2"]
                 [org.clojure/java.classpath "0.1.0"]
                 [ring "1.0.1"]
                 [enlive "1.0.0"] 
                 [cheshire "4.0.0"]]
  :plugins [[lein-ring "0.7.0"]]
  :ring {:handler kleptometrics.handler/app})