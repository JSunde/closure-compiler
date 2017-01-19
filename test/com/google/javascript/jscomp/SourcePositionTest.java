package com.google.javascript.jscomp;

import com.google.javascript.jscomp.parsing.parser.util.SourcePosition;
import org.junit.Test;
import org.junit.Assert;

public class SourcePositionTest {

  @Test
  public void testNullSource() {
    SourcePosition sp = new SourcePosition(null, 1, 2, 3);

    Assert.assertEquals(sp.toString(), "(3, 4)");
  }
}
