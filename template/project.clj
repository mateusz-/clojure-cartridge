(defproject isitstreaming "0.0.1"
	:description "A streaming aggregator"
	:dependencies [[org.clojure/clojure "1.6.0"]
	               [compojure "1.2.2"]]
	:plugins [[lein-ring "0.8.13"]]
	:ring {:handler webapp/app})
