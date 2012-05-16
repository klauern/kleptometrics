(defproject kleptometrics "1.0.0-SNAPSHOT"
  :description "A metrics-gathering thingy for multiple jobs"
  :url "https://github.com/klauern/kleptometrics.git"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.0.4"]
                 [ring-serve "0.1.2"]
                 [org.clojure/java.classpath "0.1.0"]
                 [ring "1.0.1"]
;;                 [hiccup "1.0.0"]
                 [cheshire "4.0.0"]
                 [midje "1.4.0"]]
  ;; :dev-dependencies []
  :plugins [[lein-ring "0.7.0"]
            ;[lein-ccw "1.2.0"];; Only on Leiningen 1.7.x
            [lein-midje "1.0.10"]]
  :ring {:handler kleptometrics.handler/app}
  :main kleptometrics.app)
