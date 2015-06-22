(defproject tweegeemee "1.1.9"
  :description  "tweegeemee is an experiment in image creation and breeding via twitter."
  :url          "http://github.com/rogerallen/tweegeemee"
  :license      {:name "Eclipse Public License"
                 :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [twitter-api         "0.7.8"]
                 [environ             "1.0.0"]
                 [net.mikera/clisk    "0.10.0"]
                 [tentacles           "0.3.0"]
                 [im.chit/cronj       "1.4.3"]]
  :main         ^:skip-aot tweegeemee.core
  :min-lein-version "2.0.0"
  :plugins      [[lein-environ "1.0.0"]]
  ;; Enable full optimizer, don't let heap or metaspace get too big
  ;; 296+146=442 allowing 70mb for the process
  :jvm-opts     ^:replace ["-Xms128m" "-Xmx296m" "-Xss512k" "-XX:MaxMetaspaceSize=146m"]
  :target-path  "target/%s"
  :profiles     {:uberjar {:aot :all}}
  )
