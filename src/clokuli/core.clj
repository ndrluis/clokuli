(ns clokuli.core)
(import org.sikuli.script.App)

(defn focus-app [app-name]
  (.focus (new App app-name)))

(defn write [string]
  (let [region (. App focusedWindow)]
    (.type region string)))

(defn run-script []
  (focus-app "TextEdit")
  (write "FooBar"))
