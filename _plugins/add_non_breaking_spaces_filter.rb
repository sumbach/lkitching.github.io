# source: https://alexwlchan.net/2020/adding-non-breaking-spaces-with-jekyll/
module AddNonBreakingSpacesFilter
  def add_non_breaking_spaces(input)
    text = input

    text = text.gsub(/Java (\d+)/, 'Java&nbsp;\1')
    text = text.gsub(/(fat'?|uber'?) (JAR)/i, '\1&nbsp;\2')
    text = text.gsub('Maven Central', 'Maven&nbsp;Central')
    text = text.gsub(/(super) (POM)/i, '\1&nbsp;\2')
    text = text.gsub('Clojure CLI', 'Clojure&nbsp;CLI')
    text = text.gsub(/(\bscope) (capture\b)/i, '\1&nbsp;\2')
    text = text.gsub(/(>[^'"`\s<>]+<\/)/) {|m| $1.gsub(/[-‑]/,'&#8209;')}

    text
  end
end

Liquid::Template::register_filter(AddNonBreakingSpacesFilter)
