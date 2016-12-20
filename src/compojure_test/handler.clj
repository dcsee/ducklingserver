(ns compojure-test.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [compojure.handler :as handler]
            [duckwrapper.ai :as dw]))

(defn- str-to [num]
  (apply str (interpose ", " (range 1 (inc num)))))

(defn- str-from [num]
  (apply str (interpose ", " (reverse (range 1 (inc num))))))

(defroutes app
           (GET "/count-up/:to" [to] (str-to (Integer. to)))
           (GET "/count-down/:from" [from] (str-from (Integer. from)))

           (GET "/duckling/:query" [query]
             (dw/parse-ai query))
           )





;(def app
;  (wrap-defaults app-routes site-defaults))
