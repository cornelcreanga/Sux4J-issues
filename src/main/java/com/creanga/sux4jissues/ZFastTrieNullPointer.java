package com.creanga.sux4jissues;

import it.unimi.dsi.bits.TransformationStrategies;
import it.unimi.dsi.sux4j.util.ZFastTrie;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ZFastTrieNullPointer {

    public static void main(String[] args) throws Exception{
        List<String> lines = Files.readAllLines(
            Paths.get(ClassLoader.getSystemResource("words.txt").toURI()),
            Charset.forName("utf-8"));
        ZFastTrie<String> trie = new ZFastTrie<>(TransformationStrategies.utf16());
        trie.addAll(lines);
        System.out.println("works "+trie.size());
    }

}
