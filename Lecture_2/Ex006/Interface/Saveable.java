package Lecture_2.Ex006.Interface;

import Lecture_2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
