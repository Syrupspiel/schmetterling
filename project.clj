(defproject schmetterling "0.1.0"
  :description "Web debugger for clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cdt "1.2.6.2"]
                 [http-kit "2.1.12"]
                 [polaris "0.0.2"]
                 [ring "1.2.0"]
                 [org.clojure/clojurescript "0.0-1909"]
                 [org.clojars.magomimmo/core.async "0.1.0-SNAPSHOT"]
                 [domina "1.0.2-SNAPSHOT"]
                 [org.clojure/google-closure-library-third-party "0.0-2029"]]
  :plugins [[lein-cljsbuild "0.3.3"]]
  :source-paths ["src/clj"]
  :resource-paths ["resources/"]
  :min-lein-version "2.0.0"
  :repl-options {:host "localhost"
                 :port 11911}
  :main schmetterling.core
  :cljsbuild {
    :builds {
      :dev {
        :source-paths ["src/cljs"]  
        :compiler {
          :optimizations :whitespace
          :output-to  "resources/public/js/app/schmetterling.js"
          :output-dir "resources/public/js/app/out"}}}})
