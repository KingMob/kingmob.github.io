(set-env!
 :source-paths #{"src" "content"}
 :dependencies '[[perun  "0.3.0" :scope "test"]
                 [hiccup "1.0.5"]
                 [pandeiro/boot-http "0.7.0"]])

(require '[io.perun :refer :all]
         '[pandeiro.boot-http :refer [serve]])