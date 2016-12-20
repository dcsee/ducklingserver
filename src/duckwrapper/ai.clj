(ns duckwrapper.ai
      (:require [duckling.core :as p]))

  ;defn- makes a private function
  (defn- load-ai
    []
    (p/load!))

  ;defn makes a public function
  (defn parse-ai
    [query]
    (p/parse :en$core query [:time]))




  (p/load!) ;; Load all languages

  (p/parse :en$core ;; core configuration for English ; see also :fr$core, :es$core, :zh$core
           "wake me up the last Monday of January 2015 at 6am"
           [:time]) ;; We are interested in :time expressions only ; see also :duration, :temperature, etc.