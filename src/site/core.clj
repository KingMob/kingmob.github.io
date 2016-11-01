(ns site.core
  (:require [hiccup.page :as hp]))

(defn page [data]
  (hp/html5
   [:div {:style "max-width: 900px; margin: 0 auto;"}
    [:a {:href "/"} "Home"]
    (-> data :entry :content)]))