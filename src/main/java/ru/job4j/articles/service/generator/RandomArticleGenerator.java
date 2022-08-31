package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RandomArticleGenerator implements ArticleGenerator {
    @Override
    public Article generate(List<Word> words) {
        //var wordsCopy = new ArrayList<>(words);
        Collections.shuffle(words);
        /*
        var content = wordsCopy.stream()
                .map(Word::getValue)
                .collect(Collectors.joining(" "));
         */

        StringBuilder sb = new StringBuilder();
        words.stream().map(Word::getValue).forEach((String s) -> {
            sb.append(" ");
            sb.append(s);
        });
        return new Article(sb.deleteCharAt(0).toString());
        //return new Article(content);
    }
}
