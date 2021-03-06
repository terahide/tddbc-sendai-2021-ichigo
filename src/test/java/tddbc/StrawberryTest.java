package tddbc;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static tddbc.Kind.*;
import static tddbc.Size.S;


/**
 * ＃ todo list
 * ## お題1
 * * [x] いちご(Strawberry)を生成して品種を取得する
 * * [] サイズを取得する
 */
public class StrawberryTest {
    @Nested
    class 品種のテスト{
        @Test
        @DisplayName("あまおう")
        public void あまおう() throws Exception {
            // Setup
            Strawberry sut = new Strawberry(あまおう);
            // Exercise
            Kind actual = sut.getKind();
            // Verify
            assertEquals(あまおう, actual);
        }

        @Test
        @DisplayName("とちおとめ")
        public void とちおとめ() throws Exception {
            // Setup
            Strawberry sut = new Strawberry(とちおとめ);
            // Exercise
            Kind actual = sut.getKind();
            // Verify
            assertEquals(とちおとめ, actual);
        }

        @Test
        @DisplayName("もういっこ")
        public void もういっこ() throws Exception {
            // Setup
            Strawberry sut = new Strawberry(もういっこ);
            // Exercise
            Kind actual = sut.getKind();
            // Verify
            assertEquals(もういっこ, actual);
        }
    }
    @Nested
    class サイズのテスト {
        @Test
        @DisplayName("S")
        public void s() throws Exception {
            // Setup
            Strawberry sut = new Strawberry(あまおう, S);
            // Exercise
            Size actual = sut.getSize();
            // Verify
            assertEquals(S, actual);
        }
    }
}
