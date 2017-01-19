package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test001"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel23 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test002"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(byte)-1, 1, "");
    int i4 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test003"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(byte)0, (int)(short)100, "");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    java.lang.String str6 = simpleRegion3.getSourceExcerpt();
    int i7 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str8 = simpleRegion3.getSourceExcerpt();
    int i9 = simpleRegion3.getBeginningLineNumber();
    int i10 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test004"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test005"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup22);
    java.lang.String str24 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str25 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str26 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup27 = null;
    boolean b28 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel30 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null(OFF)(hi!)"+ "'", str24.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null(OFF)(hi!)"+ "'", str25.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null(OFF)(hi!)"+ "'", str26.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test006"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard6 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup4, "hi!");
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array7 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard8 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard8, warningsGuard_array7);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard10 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard8);
    com.google.javascript.jscomp.JSError jSError11 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel12 = composeWarningsGuard10.level(jSError11);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array13 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard14 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard14, warningsGuard_array13);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard16 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard14);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array17 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, diagnosticGroupPathSuppressingWarningsGuard6, composeWarningsGuard10, composeWarningsGuard16 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard18 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18, warningsGuard_array17);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard20 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard21 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard22 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard23 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard24 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard25 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard26 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard27 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard28 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard29 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard30 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard31 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard32 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup33 = null;
    boolean b34 = composeWarningsGuard32.enables(diagnosticGroup33);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup35 = null;
    boolean b36 = composeWarningsGuard32.enables(diagnosticGroup35);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup37 = null;
    boolean b38 = composeWarningsGuard32.enables(diagnosticGroup37);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup39 = null;
    boolean b40 = composeWarningsGuard32.enables(diagnosticGroup39);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str41 = composeWarningsGuard32.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test007"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)-1, (int)(short)0, "");
    int i4 = simpleRegion3.getEndingLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    int i6 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test008"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str10 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup16);
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.JSError jSError19 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel20 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(hi!)"+ "'", str9.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(OFF)(hi!)"+ "'", str10.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test009"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup6);
    java.lang.String str8 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str12 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(OFF)(hi!)"+ "'", str8.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)(hi!)"+ "'", str11.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(OFF)(hi!)"+ "'", str12.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test010"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(hi!)"+ "'", str9.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test011"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)'4', 0, "null(OFF)(null(OFF)(null(OFF)(hi!)))");
    int i4 = simpleRegion3.getBeginningLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    int i6 = simpleRegion3.getEndingLineNumber();
    java.lang.String str7 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(hi!)))"+ "'", str7.equals("null(OFF)(null(OFF)(null(OFF)(hi!)))"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test012"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup6);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    java.lang.String str25 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)()"+ "'", str3.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)()"+ "'", str14.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null(OFF)()"+ "'", str25.equals("null(OFF)()"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test013"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(35, (int)(byte)1, "null(OFF)(null(OFF)(null(OFF)(null(OFF)())))");

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test014"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(52, 0, "hi!");

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test015"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard13.level(jSError14);
    com.google.javascript.jscomp.JSError jSError16 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel17 = composeWarningsGuard13.level(jSError16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = composeWarningsGuard13.enables(diagnosticGroup18);
    com.google.javascript.jscomp.JSError jSError20 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel21 = composeWarningsGuard13.level(jSError20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = composeWarningsGuard13.enables(diagnosticGroup22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = composeWarningsGuard13.enables(diagnosticGroup24);
    com.google.javascript.jscomp.JSError jSError26 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel27 = composeWarningsGuard13.level(jSError26);
    com.google.javascript.jscomp.JSError jSError28 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel29 = composeWarningsGuard13.level(jSError28);
    com.google.javascript.jscomp.JSError jSError30 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel31 = composeWarningsGuard13.level(jSError30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel31);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test016"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup16);
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)(hi!)"+ "'", str11.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test017"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup16);
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test018"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError13 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel14 = composeWarningsGuard12.level(jSError13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = composeWarningsGuard12.enables(diagnosticGroup15);
    com.google.javascript.jscomp.JSError jSError17 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel18 = composeWarningsGuard12.level(jSError17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel20 = composeWarningsGuard12.level(jSError19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    com.google.javascript.jscomp.JSError jSError25 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel26 = composeWarningsGuard12.level(jSError25);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup27 = null;
    boolean b28 = composeWarningsGuard12.enables(diagnosticGroup27);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = null;
    boolean b30 = composeWarningsGuard12.enables(diagnosticGroup29);
    com.google.javascript.jscomp.JSError jSError31 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel32 = composeWarningsGuard12.level(jSError31);
    com.google.javascript.jscomp.JSError jSError33 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel34 = composeWarningsGuard12.level(jSError33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel34);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test019"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard6 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup4, "hi!");
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array7 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard8 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard8, warningsGuard_array7);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard10 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard8);
    com.google.javascript.jscomp.JSError jSError11 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel12 = composeWarningsGuard10.level(jSError11);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array13 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard14 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard14, warningsGuard_array13);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard16 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard14);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array17 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, diagnosticGroupPathSuppressingWarningsGuard6, composeWarningsGuard10, composeWarningsGuard16 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard18 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18, warningsGuard_array17);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard20 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard21 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard22 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard23 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard24 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard25 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard26 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard27 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard28 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard29 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard30 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup31 = null;
    boolean b32 = composeWarningsGuard30.enables(diagnosticGroup31);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup33 = null;
    boolean b34 = composeWarningsGuard30.enables(diagnosticGroup33);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup35 = null;
    boolean b36 = composeWarningsGuard30.enables(diagnosticGroup35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test020"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard12.enables(diagnosticGroup13);
    com.google.javascript.jscomp.JSError jSError15 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel16 = composeWarningsGuard12.level(jSError15);
    com.google.javascript.jscomp.JSError jSError17 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel18 = composeWarningsGuard12.level(jSError17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = composeWarningsGuard12.enables(diagnosticGroup19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    com.google.javascript.jscomp.JSError jSError25 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel26 = composeWarningsGuard12.level(jSError25);
    com.google.javascript.jscomp.JSError jSError27 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel28 = composeWarningsGuard12.level(jSError27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel30 = composeWarningsGuard12.level(jSError29);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup31 = null;
    boolean b32 = composeWarningsGuard12.enables(diagnosticGroup31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test021"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup10);
    java.lang.String str12 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(hi!)"+ "'", str9.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(OFF)(hi!)"+ "'", str12.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test022"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.JSError jSError19 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel20 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)()"+ "'", str3.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)()"+ "'", str6.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)()"+ "'", str17.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)()"+ "'", str18.equals("null(OFF)()"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test023"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)(hi!)"+ "'", str11.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)(hi!)"+ "'", str14.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test024"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)-1, (int)'#', "");
    int i4 = simpleRegion3.getBeginningLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    int i6 = simpleRegion3.getBeginningLineNumber();
    int i7 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test025"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard11.enables(diagnosticGroup12);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard11.level(jSError14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard11.enables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = composeWarningsGuard11.enables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard11.enables(diagnosticGroup20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test026"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(hi!)"+ "'", str9.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test027"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((-1), (int)(byte)1, "null(OFF)(null(OFF)(null(OFF)(hi!)))");
    int i4 = simpleRegion3.getBeginningLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    int i6 = simpleRegion3.getEndingLineNumber();
    java.lang.String str7 = simpleRegion3.getSourceExcerpt();
    int i8 = simpleRegion3.getBeginningLineNumber();
    int i9 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(hi!)))"+ "'", str7.equals("null(OFF)(null(OFF)(null(OFF)(hi!)))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test028"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard11.enables(diagnosticGroup12);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard11.level(jSError14);
    com.google.javascript.jscomp.JSError jSError16 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel17 = composeWarningsGuard11.level(jSError16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = composeWarningsGuard11.enables(diagnosticGroup18);
    com.google.javascript.jscomp.JSError jSError20 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel21 = composeWarningsGuard11.level(jSError20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = composeWarningsGuard11.enables(diagnosticGroup22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = composeWarningsGuard11.enables(diagnosticGroup24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test029"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test030"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)()");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    java.lang.String str15 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup16);
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str15.equals("null(OFF)(null(OFF)())"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str18.equals("null(OFF)(null(OFF)())"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test031"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = composeWarningsGuard3.enables(diagnosticGroup4);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = composeWarningsGuard3.enables(diagnosticGroup6);
    com.google.javascript.jscomp.JSError jSError8 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel9 = composeWarningsGuard3.level(jSError8);
    com.google.javascript.jscomp.JSError jSError10 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel11 = composeWarningsGuard3.level(jSError10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard3.enables(diagnosticGroup12);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard3.level(jSError14);
    com.google.javascript.jscomp.JSError jSError16 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel17 = composeWarningsGuard3.level(jSError16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard3.level(jSError18);
    com.google.javascript.jscomp.JSError jSError20 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel21 = composeWarningsGuard3.level(jSError20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel23 = composeWarningsGuard3.level(jSError22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel23);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test032"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)100, 0, "");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getEndingLineNumber();
    int i7 = simpleRegion3.getEndingLineNumber();
    java.lang.String str8 = simpleRegion3.getSourceExcerpt();
    int i9 = simpleRegion3.getEndingLineNumber();
    java.lang.String str10 = simpleRegion3.getSourceExcerpt();
    java.lang.String str11 = simpleRegion3.getSourceExcerpt();
    int i12 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test033"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError13 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel14 = composeWarningsGuard12.level(jSError13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = composeWarningsGuard12.enables(diagnosticGroup15);
    com.google.javascript.jscomp.JSError jSError17 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel18 = composeWarningsGuard12.level(jSError17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel20 = composeWarningsGuard12.level(jSError19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = composeWarningsGuard12.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = composeWarningsGuard12.enables(diagnosticGroup25);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup27 = null;
    boolean b28 = composeWarningsGuard12.enables(diagnosticGroup27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel30 = composeWarningsGuard12.level(jSError29);
    com.google.javascript.jscomp.JSError jSError31 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel32 = composeWarningsGuard12.level(jSError31);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = composeWarningsGuard12.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel32);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test034"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)(null(OFF)(hi!))");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(hi!)))"+ "'", str9.equals("null(OFF)(null(OFF)(null(OFF)(hi!)))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test035"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(35, (int)(short)100, "null(OFF)(null(OFF)(hi!))");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    int i5 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str6 = simpleRegion3.getSourceExcerpt();
    java.lang.String str7 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(OFF)(null(OFF)(hi!))"+ "'", str4.equals("null(OFF)(null(OFF)(hi!))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(null(OFF)(hi!))"+ "'", str6.equals("null(OFF)(null(OFF)(hi!))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(OFF)(null(OFF)(hi!))"+ "'", str7.equals("null(OFF)(null(OFF)(hi!))"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test036"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(10, (int)(byte)-1, "");
    int i4 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test037"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup10);
    java.lang.String str12 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(hi!)"+ "'", str9.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(OFF)(hi!)"+ "'", str12.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test038"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(1, (int)(short)10, "");
    int i4 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getEndingLineNumber();
    int i7 = simpleRegion3.getEndingLineNumber();
    java.lang.String str8 = simpleRegion3.getSourceExcerpt();
    int i9 = simpleRegion3.getEndingLineNumber();
    int i10 = simpleRegion3.getBeginningLineNumber();
    int i11 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test039"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard11.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = composeWarningsGuard11.enables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard11.enables(diagnosticGroup16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard11.level(jSError18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard11.enables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = composeWarningsGuard11.enables(diagnosticGroup22);
    com.google.javascript.jscomp.JSError jSError24 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel25 = composeWarningsGuard11.level(jSError24);
    com.google.javascript.jscomp.JSError jSError26 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel27 = composeWarningsGuard11.level(jSError26);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup28 = null;
    boolean b29 = composeWarningsGuard11.enables(diagnosticGroup28);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup30 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b31 = composeWarningsGuard11.disables(diagnosticGroup30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test040"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)(null(OFF)(null(OFF)(hi!)))");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!))))"+ "'", str13.equals("null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!))))"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test041"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard4 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard5 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard6 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard8 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard9 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard10 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard11.enables(diagnosticGroup12);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard11.level(jSError14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard11.enables(diagnosticGroup16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard11.level(jSError18);
    com.google.javascript.jscomp.JSError jSError20 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel21 = composeWarningsGuard11.level(jSError20);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = composeWarningsGuard11.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel21);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test042"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup20);
    java.lang.String str22 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup25);
    java.lang.String str27 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str28 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard31 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup29, "hi!");
    java.lang.String str32 = diagnosticGroupPathSuppressingWarningsGuard31.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup33 = null;
    boolean b34 = diagnosticGroupPathSuppressingWarningsGuard31.enables(diagnosticGroup33);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup35 = null;
    boolean b36 = diagnosticGroupPathSuppressingWarningsGuard31.disables(diagnosticGroup35);
    java.lang.String str37 = diagnosticGroupPathSuppressingWarningsGuard31.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup38 = null;
    boolean b39 = diagnosticGroupPathSuppressingWarningsGuard31.enables(diagnosticGroup38);
    java.lang.String str40 = diagnosticGroupPathSuppressingWarningsGuard31.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup41 = null;
    boolean b42 = diagnosticGroupPathSuppressingWarningsGuard31.disables(diagnosticGroup41);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup43 = null;
    boolean b44 = diagnosticGroupPathSuppressingWarningsGuard31.disables(diagnosticGroup43);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup45 = null;
    boolean b46 = diagnosticGroupPathSuppressingWarningsGuard31.disables(diagnosticGroup45);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array47 = new com.google.javascript.jscomp.WarningsGuard[] { diagnosticGroupPathSuppressingWarningsGuard2, diagnosticGroupPathSuppressingWarningsGuard31 };
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard48 = new com.google.javascript.jscomp.ComposeWarningsGuard(warningsGuard_array47);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)(hi!)"+ "'", str17.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null(OFF)(hi!)"+ "'", str22.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "null(OFF)(hi!)"+ "'", str27.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "null(OFF)(hi!)"+ "'", str28.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "null(OFF)(hi!)"+ "'", str32.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "null(OFF)(hi!)"+ "'", str37.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "null(OFF)(hi!)"+ "'", str40.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array47);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test043"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard12.enables(diagnosticGroup13);
    com.google.javascript.jscomp.JSError jSError15 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel16 = composeWarningsGuard12.level(jSError15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = composeWarningsGuard12.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = composeWarningsGuard12.enables(diagnosticGroup19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.JSError jSError23 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel24 = composeWarningsGuard12.level(jSError23);
    com.google.javascript.jscomp.JSError jSError25 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel26 = composeWarningsGuard12.level(jSError25);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup27 = null;
    boolean b28 = composeWarningsGuard12.enables(diagnosticGroup27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel30 = composeWarningsGuard12.level(jSError29);
    com.google.javascript.jscomp.JSError jSError31 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel32 = composeWarningsGuard12.level(jSError31);
    com.google.javascript.jscomp.JSError jSError33 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel34 = composeWarningsGuard12.level(jSError33);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup35 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b36 = composeWarningsGuard12.disables(diagnosticGroup35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel34);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test044"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(52, 1, "null(OFF)(null(OFF)())");

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test045"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)' ', 52, "null(OFF)(null(OFF)(null(OFF)()))");

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test046"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)1, (int)(byte)100, "null(OFF)(null(OFF)(null(OFF)(hi!)))");
    int i4 = simpleRegion3.getEndingLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test047"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    java.lang.String str15 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(OFF)(hi!)"+ "'", str15.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test048"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError13 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel14 = composeWarningsGuard12.level(jSError13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = composeWarningsGuard12.enables(diagnosticGroup15);
    com.google.javascript.jscomp.JSError jSError17 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel18 = composeWarningsGuard12.level(jSError17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = composeWarningsGuard12.enables(diagnosticGroup19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = composeWarningsGuard12.enables(diagnosticGroup25);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = composeWarningsGuard12.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test049"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)1, (int)(short)100, "hi!");
    int i4 = simpleRegion3.getEndingLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getEndingLineNumber();
    int i7 = simpleRegion3.getBeginningLineNumber();
    int i8 = simpleRegion3.getEndingLineNumber();
    int i9 = simpleRegion3.getEndingLineNumber();
    java.lang.String str10 = simpleRegion3.getSourceExcerpt();
    int i11 = simpleRegion3.getBeginningLineNumber();
    int i12 = simpleRegion3.getEndingLineNumber();
    int i13 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test050"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)()"+ "'", str3.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)()"+ "'", str6.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test051"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)(null(OFF)())");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.JSError jSError7 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel8 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test052"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str10 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.JSError jSError14 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel15 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)()"+ "'", str3.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)()"+ "'", str6.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)()"+ "'", str9.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(OFF)()"+ "'", str10.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)()"+ "'", str13.equals("null(OFF)()"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test053"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup10);
    java.lang.String str12 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup16);
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(hi!)"+ "'", str9.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(OFF)(hi!)"+ "'", str12.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test054"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)(hi!)"+ "'", str14.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)(hi!)"+ "'", str17.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test055"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup14);
    java.lang.String str16 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup18);
    java.lang.String str20 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str21 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup24);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard28 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup26, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = null;
    boolean b30 = diagnosticGroupPathSuppressingWarningsGuard28.disables(diagnosticGroup29);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup31 = null;
    boolean b32 = diagnosticGroupPathSuppressingWarningsGuard28.disables(diagnosticGroup31);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup33 = null;
    boolean b34 = diagnosticGroupPathSuppressingWarningsGuard28.disables(diagnosticGroup33);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup35 = null;
    boolean b36 = diagnosticGroupPathSuppressingWarningsGuard28.disables(diagnosticGroup35);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup37 = null;
    boolean b38 = diagnosticGroupPathSuppressingWarningsGuard28.disables(diagnosticGroup37);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup39 = null;
    boolean b40 = diagnosticGroupPathSuppressingWarningsGuard28.enables(diagnosticGroup39);
    java.lang.String str41 = diagnosticGroupPathSuppressingWarningsGuard28.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup42 = null;
    boolean b43 = diagnosticGroupPathSuppressingWarningsGuard28.disables(diagnosticGroup42);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup44 = null;
    boolean b45 = diagnosticGroupPathSuppressingWarningsGuard28.disables(diagnosticGroup44);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup46 = null;
    boolean b47 = diagnosticGroupPathSuppressingWarningsGuard28.enables(diagnosticGroup46);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup48 = null;
    boolean b49 = diagnosticGroupPathSuppressingWarningsGuard28.enables(diagnosticGroup48);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup50 = null;
    boolean b51 = diagnosticGroupPathSuppressingWarningsGuard28.disables(diagnosticGroup50);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup52 = null;
    boolean b53 = diagnosticGroupPathSuppressingWarningsGuard28.disables(diagnosticGroup52);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup54 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard56 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup54, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup57 = null;
    boolean b58 = diagnosticGroupPathSuppressingWarningsGuard56.disables(diagnosticGroup57);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup59 = null;
    boolean b60 = diagnosticGroupPathSuppressingWarningsGuard56.disables(diagnosticGroup59);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup61 = null;
    boolean b62 = diagnosticGroupPathSuppressingWarningsGuard56.disables(diagnosticGroup61);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup63 = null;
    boolean b64 = diagnosticGroupPathSuppressingWarningsGuard56.enables(diagnosticGroup63);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup65 = null;
    boolean b66 = diagnosticGroupPathSuppressingWarningsGuard56.disables(diagnosticGroup65);
    java.lang.String str67 = diagnosticGroupPathSuppressingWarningsGuard56.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup68 = null;
    boolean b69 = diagnosticGroupPathSuppressingWarningsGuard56.disables(diagnosticGroup68);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup70 = null;
    boolean b71 = diagnosticGroupPathSuppressingWarningsGuard56.disables(diagnosticGroup70);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array72 = new com.google.javascript.jscomp.WarningsGuard[] { diagnosticGroupPathSuppressingWarningsGuard2, diagnosticGroupPathSuppressingWarningsGuard28, diagnosticGroupPathSuppressingWarningsGuard56 };
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard73 = new com.google.javascript.jscomp.ComposeWarningsGuard(warningsGuard_array72);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(OFF)(hi!)"+ "'", str16.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)(hi!)"+ "'", str17.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null(OFF)(hi!)"+ "'", str20.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null(OFF)(hi!)"+ "'", str21.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "null(OFF)(hi!)"+ "'", str41.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "null(OFF)(hi!)"+ "'", str67.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array72);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test056"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    java.lang.String str25 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.JSError jSError26 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel27 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)(hi!)"+ "'", str17.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null(OFF)(hi!)"+ "'", str25.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test057"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(100, (int)'a', "");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    int i5 = simpleRegion3.getBeginningLineNumber();
    int i6 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test058"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)()");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str10 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str9.equals("null(OFF)(null(OFF)())"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str10.equals("null(OFF)(null(OFF)())"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str11.equals("null(OFF)(null(OFF)())"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test059"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup13);
    java.lang.String str15 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str16 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    java.lang.String str19 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup24);
    java.lang.String str26 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str27 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(OFF)(hi!)"+ "'", str15.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(OFF)(hi!)"+ "'", str16.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(OFF)(hi!)"+ "'", str19.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null(OFF)(hi!)"+ "'", str26.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "null(OFF)(hi!)"+ "'", str27.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test060"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    java.lang.String str7 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    java.lang.String str16 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(OFF)(hi!)"+ "'", str7.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(OFF)(hi!)"+ "'", str16.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test061"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard12.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = composeWarningsGuard12.enables(diagnosticGroup15);
    com.google.javascript.jscomp.JSError jSError17 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel18 = composeWarningsGuard12.level(jSError17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel20 = composeWarningsGuard12.level(jSError19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = composeWarningsGuard12.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test062"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup14);
    java.lang.String str16 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    java.lang.String str19 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup24);
    com.google.javascript.jscomp.JSError jSError26 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel27 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(OFF)(hi!)"+ "'", str16.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(OFF)(hi!)"+ "'", str19.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test063"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard11.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = composeWarningsGuard11.enables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard11.enables(diagnosticGroup16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard11.level(jSError18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard11.enables(diagnosticGroup20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel23 = composeWarningsGuard11.level(jSError22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = composeWarningsGuard11.enables(diagnosticGroup24);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = composeWarningsGuard11.enables(diagnosticGroup26);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup28 = null;
    boolean b29 = composeWarningsGuard11.enables(diagnosticGroup28);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup30 = null;
    boolean b31 = composeWarningsGuard11.enables(diagnosticGroup30);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup32 = null;
    boolean b33 = composeWarningsGuard11.enables(diagnosticGroup32);
    com.google.javascript.jscomp.JSError jSError34 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel35 = composeWarningsGuard11.level(jSError34);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup36 = null;
    boolean b37 = composeWarningsGuard11.enables(diagnosticGroup36);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup38 = null;
    boolean b39 = composeWarningsGuard11.enables(diagnosticGroup38);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str40 = composeWarningsGuard11.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test064"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard4 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard5 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard6 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.JSError jSError8 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel9 = composeWarningsGuard7.level(jSError8);
    com.google.javascript.jscomp.JSError jSError10 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel11 = composeWarningsGuard7.level(jSError10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard7.enables(diagnosticGroup12);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard7.level(jSError14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard7.enables(diagnosticGroup16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard7.level(jSError18);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = composeWarningsGuard7.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test065"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard12.enables(diagnosticGroup13);
    com.google.javascript.jscomp.JSError jSError15 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel16 = composeWarningsGuard12.level(jSError15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = composeWarningsGuard12.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = composeWarningsGuard12.enables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = composeWarningsGuard12.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = composeWarningsGuard12.enables(diagnosticGroup25);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup27 = null;
    boolean b28 = composeWarningsGuard12.enables(diagnosticGroup27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel30 = composeWarningsGuard12.level(jSError29);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup31 = null;
    boolean b32 = composeWarningsGuard12.enables(diagnosticGroup31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test066"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard12.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = composeWarningsGuard12.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = composeWarningsGuard12.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = composeWarningsGuard12.enables(diagnosticGroup19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = composeWarningsGuard12.enables(diagnosticGroup25);
    com.google.javascript.jscomp.JSError jSError27 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel28 = composeWarningsGuard12.level(jSError27);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = null;
    boolean b30 = composeWarningsGuard12.enables(diagnosticGroup29);
    com.google.javascript.jscomp.JSError jSError31 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel32 = composeWarningsGuard12.level(jSError31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel32);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test067"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)'#', (int)'4', "");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    int i5 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test068"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(0, (int)(short)1, "null(OFF)(null(OFF)(null(OFF)(hi!)))");

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test069"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)10, (int)(short)0, "null(OFF)(null(OFF)(null(OFF)(hi!)))");

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test070"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard4 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard5 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard6 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard8 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.JSError jSError9 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel10 = composeWarningsGuard8.level(jSError9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = composeWarningsGuard8.enables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard8.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = composeWarningsGuard8.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = composeWarningsGuard8.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = composeWarningsGuard8.enables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = composeWarningsGuard8.enables(diagnosticGroup21);
    com.google.javascript.jscomp.JSError jSError23 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel24 = composeWarningsGuard8.level(jSError23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = composeWarningsGuard8.enables(diagnosticGroup25);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = composeWarningsGuard8.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test071"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)'4', (int)(byte)10, "hi!");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    int i5 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str6 = simpleRegion3.getSourceExcerpt();
    int i7 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str8 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test072"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup20);
    java.lang.String str22 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    java.lang.String str25 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup26);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup28 = null;
    boolean b29 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup28);
    com.google.javascript.jscomp.JSError jSError30 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel31 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)(hi!)"+ "'", str17.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null(OFF)(hi!)"+ "'", str22.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null(OFF)(hi!)"+ "'", str25.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test073"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)0, (int)(byte)10, "null(OFF)()");

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test074"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup6);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup23);
    com.google.javascript.jscomp.JSError jSError25 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel26 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)()"+ "'", str3.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)()"+ "'", str14.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test075"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(1, (int)(short)-1, "null(OFF)(null(OFF)(null(OFF)(hi!)))");
    int i4 = simpleRegion3.getEndingLineNumber();
    int i5 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test076"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(35, (int)(short)10, "null(OFF)()");

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test077"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!))))");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!)))))"+ "'", str5.equals("null(OFF)(null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!)))))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!)))))"+ "'", str6.equals("null(OFF)(null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!)))))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test078"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(byte)0, 32, "null(OFF)(null(OFF)(null(OFF)()))");
    int i4 = simpleRegion3.getEndingLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test079"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)' ', 35, "null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!))))");

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test080"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)'a', (int)'4', "null(OFF)()");

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test081"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard14 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard15 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard16 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard17 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard18 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard19 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard20 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard21 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard22 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard23 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard24 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard25 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard26 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard27 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard28 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard29 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard30 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard31 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard32 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard33 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard34 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError35 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel36 = composeWarningsGuard34.level(jSError35);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup37 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b38 = composeWarningsGuard34.disables(diagnosticGroup37);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel36);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test082"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)100, (-1), "null(OFF)(null(OFF)(null(OFF)(hi!)))");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(hi!)))"+ "'", str4.equals("null(OFF)(null(OFF)(null(OFF)(hi!)))"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test083"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup21);
    com.google.javascript.jscomp.JSError jSError23 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel24 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)(hi!)"+ "'", str14.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)(hi!)"+ "'", str17.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test084"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(byte)100, (int)(short)-1, "null(OFF)(hi!)");
    int i4 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    java.lang.String str6 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test085"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(97, (int)(byte)0, "");
    int i4 = simpleRegion3.getEndingLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    java.lang.String str6 = simpleRegion3.getSourceExcerpt();
    int i7 = simpleRegion3.getEndingLineNumber();
    java.lang.String str8 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test086"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)(hi!)"+ "'", str11.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test087"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)(null(OFF)(hi!))");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup6);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard12 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup10, "null(OFF)(hi!)");
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard12.toString();
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard12.toString();
    java.lang.String str15 = diagnosticGroupPathSuppressingWarningsGuard12.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard12.disables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard12.enables(diagnosticGroup18);
    java.lang.String str20 = diagnosticGroupPathSuppressingWarningsGuard12.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard23 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup21, "null(OFF)(null(OFF)())");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = diagnosticGroupPathSuppressingWarningsGuard23.disables(diagnosticGroup24);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = diagnosticGroupPathSuppressingWarningsGuard23.disables(diagnosticGroup26);
    java.lang.String str28 = diagnosticGroupPathSuppressingWarningsGuard23.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = null;
    boolean b30 = diagnosticGroupPathSuppressingWarningsGuard23.disables(diagnosticGroup29);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup31 = null;
    boolean b32 = diagnosticGroupPathSuppressingWarningsGuard23.enables(diagnosticGroup31);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup33 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard35 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup33, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup36 = null;
    boolean b37 = diagnosticGroupPathSuppressingWarningsGuard35.disables(diagnosticGroup36);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup38 = null;
    boolean b39 = diagnosticGroupPathSuppressingWarningsGuard35.disables(diagnosticGroup38);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup40 = null;
    boolean b41 = diagnosticGroupPathSuppressingWarningsGuard35.disables(diagnosticGroup40);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup42 = null;
    boolean b43 = diagnosticGroupPathSuppressingWarningsGuard35.disables(diagnosticGroup42);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup44 = null;
    boolean b45 = diagnosticGroupPathSuppressingWarningsGuard35.disables(diagnosticGroup44);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup46 = null;
    boolean b47 = diagnosticGroupPathSuppressingWarningsGuard35.enables(diagnosticGroup46);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup48 = null;
    boolean b49 = diagnosticGroupPathSuppressingWarningsGuard35.enables(diagnosticGroup48);
    java.lang.String str50 = diagnosticGroupPathSuppressingWarningsGuard35.toString();
    java.lang.String str51 = diagnosticGroupPathSuppressingWarningsGuard35.toString();
    java.lang.String str52 = diagnosticGroupPathSuppressingWarningsGuard35.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup53 = null;
    boolean b54 = diagnosticGroupPathSuppressingWarningsGuard35.disables(diagnosticGroup53);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup55 = null;
    boolean b56 = diagnosticGroupPathSuppressingWarningsGuard35.disables(diagnosticGroup55);
    java.lang.String str57 = diagnosticGroupPathSuppressingWarningsGuard35.toString();
    java.lang.String str58 = diagnosticGroupPathSuppressingWarningsGuard35.toString();
    java.lang.String str59 = diagnosticGroupPathSuppressingWarningsGuard35.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup60 = null;
    boolean b61 = diagnosticGroupPathSuppressingWarningsGuard35.enables(diagnosticGroup60);
    java.lang.String str62 = diagnosticGroupPathSuppressingWarningsGuard35.toString();
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array63 = new com.google.javascript.jscomp.WarningsGuard[] { diagnosticGroupPathSuppressingWarningsGuard2, diagnosticGroupPathSuppressingWarningsGuard12, diagnosticGroupPathSuppressingWarningsGuard23, diagnosticGroupPathSuppressingWarningsGuard35 };
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard64 = new com.google.javascript.jscomp.ComposeWarningsGuard(warningsGuard_array63);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(hi!)))"+ "'", str3.equals("null(OFF)(null(OFF)(null(OFF)(hi!)))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(null(OFF)(hi!))"+ "'", str13.equals("null(OFF)(null(OFF)(hi!))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)(null(OFF)(hi!))"+ "'", str14.equals("null(OFF)(null(OFF)(hi!))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(OFF)(null(OFF)(hi!))"+ "'", str15.equals("null(OFF)(null(OFF)(hi!))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null(OFF)(null(OFF)(hi!))"+ "'", str20.equals("null(OFF)(null(OFF)(hi!))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "null(OFF)(null(OFF)(null(OFF)()))"+ "'", str28.equals("null(OFF)(null(OFF)(null(OFF)()))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "null(OFF)(hi!)"+ "'", str50.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "null(OFF)(hi!)"+ "'", str51.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "null(OFF)(hi!)"+ "'", str52.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "null(OFF)(hi!)"+ "'", str57.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "null(OFF)(hi!)"+ "'", str58.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "null(OFF)(hi!)"+ "'", str59.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "null(OFF)(hi!)"+ "'", str62.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array63);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test088"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(0, 100, "hi!");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test089"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)(null(OFF)())");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    java.lang.String str7 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup8);
    java.lang.String str10 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(OFF)(null(OFF)(null(OFF)()))"+ "'", str7.equals("null(OFF)(null(OFF)(null(OFF)()))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(OFF)(null(OFF)(null(OFF)()))"+ "'", str10.equals("null(OFF)(null(OFF)(null(OFF)()))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)(null(OFF)(null(OFF)()))"+ "'", str11.equals("null(OFF)(null(OFF)(null(OFF)()))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test090"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError13 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel14 = composeWarningsGuard12.level(jSError13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = composeWarningsGuard12.enables(diagnosticGroup15);
    com.google.javascript.jscomp.JSError jSError17 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel18 = composeWarningsGuard12.level(jSError17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel20 = composeWarningsGuard12.level(jSError19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.JSError jSError23 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel24 = composeWarningsGuard12.level(jSError23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = composeWarningsGuard12.enables(diagnosticGroup25);
    com.google.javascript.jscomp.JSError jSError27 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel28 = composeWarningsGuard12.level(jSError27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel30 = composeWarningsGuard12.level(jSError29);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup31 = null;
    boolean b32 = composeWarningsGuard12.enables(diagnosticGroup31);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup33 = null;
    boolean b34 = composeWarningsGuard12.enables(diagnosticGroup33);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup35 = null;
    boolean b36 = composeWarningsGuard12.enables(diagnosticGroup35);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup37 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b38 = composeWarningsGuard12.disables(diagnosticGroup37);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test091"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = composeWarningsGuard13.enables(diagnosticGroup14);
    com.google.javascript.jscomp.JSError jSError16 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel17 = composeWarningsGuard13.level(jSError16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard13.level(jSError18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard13.enables(diagnosticGroup20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel23 = composeWarningsGuard13.level(jSError22);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = composeWarningsGuard13.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel23);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test092"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard6 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup4, "hi!");
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array7 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard8 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard8, warningsGuard_array7);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard10 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard8);
    com.google.javascript.jscomp.JSError jSError11 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel12 = composeWarningsGuard10.level(jSError11);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array13 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard14 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard14, warningsGuard_array13);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard16 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard14);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array17 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, diagnosticGroupPathSuppressingWarningsGuard6, composeWarningsGuard10, composeWarningsGuard16 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard18 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18, warningsGuard_array17);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard20 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard21 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard22 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard23 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard24 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard25 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard26 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard27 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard28 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard29 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard30 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard31 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard32 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard33 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard34 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard35 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard36 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard37 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard38 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard39 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard40 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard41 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup42 = null;
    boolean b43 = composeWarningsGuard41.enables(diagnosticGroup42);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup44 = null;
    boolean b45 = composeWarningsGuard41.enables(diagnosticGroup44);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str46 = composeWarningsGuard41.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test093"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard12.enables(diagnosticGroup13);
    com.google.javascript.jscomp.JSError jSError15 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel16 = composeWarningsGuard12.level(jSError15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = composeWarningsGuard12.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = composeWarningsGuard12.enables(diagnosticGroup19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = composeWarningsGuard12.enables(diagnosticGroup25);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup27 = null;
    boolean b28 = composeWarningsGuard12.enables(diagnosticGroup27);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = null;
    boolean b30 = composeWarningsGuard12.enables(diagnosticGroup29);
    com.google.javascript.jscomp.JSError jSError31 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel32 = composeWarningsGuard12.level(jSError31);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup33 = null;
    boolean b34 = composeWarningsGuard12.enables(diagnosticGroup33);
    com.google.javascript.jscomp.JSError jSError35 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel36 = composeWarningsGuard12.level(jSError35);
    com.google.javascript.jscomp.JSError jSError37 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel38 = composeWarningsGuard12.level(jSError37);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup39 = null;
    boolean b40 = composeWarningsGuard12.enables(diagnosticGroup39);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array41 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard12 };
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard42 = new com.google.javascript.jscomp.ComposeWarningsGuard(warningsGuard_array41);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array41);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test094"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError13 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel14 = composeWarningsGuard12.level(jSError13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = composeWarningsGuard12.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = composeWarningsGuard12.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = composeWarningsGuard12.enables(diagnosticGroup19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.JSError jSError23 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel24 = composeWarningsGuard12.level(jSError23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b26 = composeWarningsGuard12.disables(diagnosticGroup25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel24);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test095"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)0, 10, "");
    int i4 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test096"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((-1), 0, "null(OFF)(null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!)))))");

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test097"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)1, (int)(byte)1, "hi!");
    int i4 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test098"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str12 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)()"+ "'", str3.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)()"+ "'", str6.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)()"+ "'", str11.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(OFF)()"+ "'", str12.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)()"+ "'", str17.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test099"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup6);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup10);
    java.lang.String str12 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup18);
    java.lang.String str20 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)(hi!)"+ "'", str3.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(OFF)(hi!)"+ "'", str12.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null(OFF)(hi!)"+ "'", str20.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test100"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    java.lang.String str16 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup18);
    java.lang.String str20 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array25 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard26 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard26, warningsGuard_array25);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard28 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard26);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array29 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard30 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard30, warningsGuard_array29);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard32 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard30);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array33 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard28, composeWarningsGuard32 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard34 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard34, warningsGuard_array33);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard36 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard34);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard37 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard34);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup38 = null;
    boolean b39 = composeWarningsGuard37.enables(diagnosticGroup38);
    com.google.javascript.jscomp.JSError jSError40 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel41 = composeWarningsGuard37.level(jSError40);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup42 = null;
    boolean b43 = composeWarningsGuard37.enables(diagnosticGroup42);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup44 = null;
    boolean b45 = composeWarningsGuard37.enables(diagnosticGroup44);
    com.google.javascript.jscomp.JSError jSError46 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel47 = composeWarningsGuard37.level(jSError46);
    com.google.javascript.jscomp.JSError jSError48 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel49 = composeWarningsGuard37.level(jSError48);
    com.google.javascript.jscomp.JSError jSError50 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel51 = composeWarningsGuard37.level(jSError50);
    com.google.javascript.jscomp.JSError jSError52 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel53 = composeWarningsGuard37.level(jSError52);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup54 = null;
    boolean b55 = composeWarningsGuard37.enables(diagnosticGroup54);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup56 = null;
    boolean b57 = composeWarningsGuard37.enables(diagnosticGroup56);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup58 = null;
    boolean b59 = composeWarningsGuard37.enables(diagnosticGroup58);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup60 = null;
    boolean b61 = composeWarningsGuard37.enables(diagnosticGroup60);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup62 = null;
    boolean b63 = composeWarningsGuard37.enables(diagnosticGroup62);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array64 = new com.google.javascript.jscomp.WarningsGuard[] { diagnosticGroupPathSuppressingWarningsGuard2, composeWarningsGuard37 };
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard65 = new com.google.javascript.jscomp.ComposeWarningsGuard(warningsGuard_array64);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(hi!)"+ "'", str9.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(OFF)(hi!)"+ "'", str16.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)(hi!)"+ "'", str17.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null(OFF)(hi!)"+ "'", str20.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array64);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test101"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard4 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard5 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard6 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard8 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard9 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard10 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard14 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard15 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard16 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard17 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard18 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard19 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard20 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard20.level(jSError21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard20.enables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = composeWarningsGuard20.enables(diagnosticGroup25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test102"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard12.enables(diagnosticGroup13);
    com.google.javascript.jscomp.JSError jSError15 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel16 = composeWarningsGuard12.level(jSError15);
    com.google.javascript.jscomp.JSError jSError17 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel18 = composeWarningsGuard12.level(jSError17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel20 = composeWarningsGuard12.level(jSError19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    com.google.javascript.jscomp.JSError jSError25 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel26 = composeWarningsGuard12.level(jSError25);
    com.google.javascript.jscomp.JSError jSError27 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel28 = composeWarningsGuard12.level(jSError27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel30 = composeWarningsGuard12.level(jSError29);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = composeWarningsGuard12.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel30);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test103"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup12);
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup19);
    java.lang.String str21 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(hi!)"+ "'", str9.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)(hi!)"+ "'", str14.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)(hi!)"+ "'", str17.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null(OFF)(hi!)"+ "'", str21.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test104"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup16);
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup19);
    java.lang.String str21 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str22 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup25);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup27 = null;
    boolean b28 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup27);
    java.lang.String str29 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup30 = null;
    boolean b31 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null(OFF)(hi!)"+ "'", str21.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null(OFF)(hi!)"+ "'", str22.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "null(OFF)(hi!)"+ "'", str29.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test105"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(35, 32, "null(OFF)(null(OFF)(null(OFF)(null(OFF)())))");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(null(OFF)())))"+ "'", str4.equals("null(OFF)(null(OFF)(null(OFF)(null(OFF)())))"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test106"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)(null(OFF)(null(OFF)()))");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup5);
    java.lang.String str7 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup8);
    com.google.javascript.jscomp.JSError jSError10 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel11 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(null(OFF)())))"+ "'", str7.equals("null(OFF)(null(OFF)(null(OFF)(null(OFF)())))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test107"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str15 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup18);
    com.google.javascript.jscomp.JSError jSError20 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel21 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)(hi!)"+ "'", str14.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(OFF)(hi!)"+ "'", str15.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test108"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)'4', (int)'#', "null(OFF)()");

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test109"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = composeWarningsGuard13.enables(diagnosticGroup14);
    com.google.javascript.jscomp.JSError jSError16 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel17 = composeWarningsGuard13.level(jSError16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard13.level(jSError18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard13.enables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = composeWarningsGuard13.enables(diagnosticGroup22);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = composeWarningsGuard13.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test110"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)' ', 1, "null(OFF)(null(OFF)())");
    int i4 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    java.lang.String str6 = simpleRegion3.getSourceExcerpt();
    int i7 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str5.equals("null(OFF)(null(OFF)())"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str6.equals("null(OFF)(null(OFF)())"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test111"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(100, (int)(short)1, "");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    int i5 = simpleRegion3.getBeginningLineNumber();
    int i6 = simpleRegion3.getEndingLineNumber();
    int i7 = simpleRegion3.getBeginningLineNumber();
    int i8 = simpleRegion3.getEndingLineNumber();
    java.lang.String str9 = simpleRegion3.getSourceExcerpt();
    int i10 = simpleRegion3.getBeginningLineNumber();
    int i11 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test112"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)(null(OFF)(null(OFF)(hi!)))");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup15);
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.JSError jSError18 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel19 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!))))"+ "'", str17.equals("null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!))))"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test113"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup6);
    java.lang.String str8 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)(hi!)"+ "'", str3.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(OFF)(hi!)"+ "'", str8.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test114"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard12.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = composeWarningsGuard12.enables(diagnosticGroup15);
    com.google.javascript.jscomp.JSError jSError17 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel18 = composeWarningsGuard12.level(jSError17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel20 = composeWarningsGuard12.level(jSError19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = composeWarningsGuard12.enables(diagnosticGroup25);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = composeWarningsGuard12.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test115"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(100, (int)'a', "");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getBeginningLineNumber();
    int i7 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test116"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup20);
    java.lang.String str22 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    java.lang.String str25 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null(OFF)(hi!)"+ "'", str22.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null(OFF)(hi!)"+ "'", str25.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test117"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)-1, (int)(short)1, "null(OFF)(hi!)");

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test118"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.JSError jSError4 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel5 = composeWarningsGuard3.level(jSError4);
    com.google.javascript.jscomp.JSError jSError6 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel7 = composeWarningsGuard3.level(jSError6);
    com.google.javascript.jscomp.JSError jSError8 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel9 = composeWarningsGuard3.level(jSError8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = composeWarningsGuard3.enables(diagnosticGroup10);
    com.google.javascript.jscomp.JSError jSError12 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel13 = composeWarningsGuard3.level(jSError12);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard3.level(jSError14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard3.enables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = composeWarningsGuard3.enables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard3.enables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = composeWarningsGuard3.enables(diagnosticGroup22);
    com.google.javascript.jscomp.JSError jSError24 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel25 = composeWarningsGuard3.level(jSError24);
    com.google.javascript.jscomp.JSError jSError26 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel27 = composeWarningsGuard3.level(jSError26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel27);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test119"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = composeWarningsGuard3.enables(diagnosticGroup4);
    com.google.javascript.jscomp.JSError jSError6 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel7 = composeWarningsGuard3.level(jSError6);
    com.google.javascript.jscomp.JSError jSError8 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel9 = composeWarningsGuard3.level(jSError8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = composeWarningsGuard3.enables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard3.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = composeWarningsGuard3.enables(diagnosticGroup14);
    com.google.javascript.jscomp.JSError jSError16 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel17 = composeWarningsGuard3.level(jSError16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard3.level(jSError18);
    com.google.javascript.jscomp.JSError jSError20 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel21 = composeWarningsGuard3.level(jSError20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel23 = composeWarningsGuard3.level(jSError22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = composeWarningsGuard3.enables(diagnosticGroup24);
    com.google.javascript.jscomp.JSError jSError26 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel27 = composeWarningsGuard3.level(jSError26);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup28 = null;
    boolean b29 = composeWarningsGuard3.enables(diagnosticGroup28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test120"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(10, (int)(short)-1, "hi!");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    int i5 = simpleRegion3.getEndingLineNumber();
    int i6 = simpleRegion3.getEndingLineNumber();
    int i7 = simpleRegion3.getBeginningLineNumber();
    int i8 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str9 = simpleRegion3.getSourceExcerpt();
    int i10 = simpleRegion3.getEndingLineNumber();
    java.lang.String str11 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test121"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)(hi!)");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str4 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)(null(OFF)(hi!))"+ "'", str3.equals("null(OFF)(null(OFF)(hi!))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(OFF)(null(OFF)(hi!))"+ "'", str4.equals("null(OFF)(null(OFF)(hi!))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test122"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard11.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = composeWarningsGuard11.enables(diagnosticGroup14);
    com.google.javascript.jscomp.JSError jSError16 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel17 = composeWarningsGuard11.level(jSError16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard11.level(jSError18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard11.enables(diagnosticGroup20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel23 = composeWarningsGuard11.level(jSError22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel23);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test123"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup23);
    java.lang.String str25 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str26 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup27 = null;
    boolean b28 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null(OFF)(hi!)"+ "'", str25.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null(OFF)(hi!)"+ "'", str26.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test124"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(10, (int)'4', "");
    int i4 = simpleRegion3.getEndingLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getEndingLineNumber();
    int i7 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str8 = simpleRegion3.getSourceExcerpt();
    int i9 = simpleRegion3.getEndingLineNumber();
    int i10 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test125"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard4 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard5 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard6 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard8 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard9 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard10 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard14 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard15 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard16 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard17 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard18 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard19 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard19.enables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = composeWarningsGuard19.enables(diagnosticGroup22);
    com.google.javascript.jscomp.JSError jSError24 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel25 = composeWarningsGuard19.level(jSError24);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = composeWarningsGuard19.enables(diagnosticGroup26);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup28 = null;
    boolean b29 = composeWarningsGuard19.enables(diagnosticGroup28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test126"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(100, 1, "null(OFF)(null(OFF)(hi!))");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    int i5 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(OFF)(null(OFF)(hi!))"+ "'", str4.equals("null(OFF)(null(OFF)(hi!))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test127"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(97, 32, "");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getBeginningLineNumber();
    int i7 = simpleRegion3.getBeginningLineNumber();
    int i8 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test128"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError13 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel14 = composeWarningsGuard12.level(jSError13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = composeWarningsGuard12.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = composeWarningsGuard12.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = composeWarningsGuard12.enables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = composeWarningsGuard12.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    com.google.javascript.jscomp.JSError jSError25 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel26 = composeWarningsGuard12.level(jSError25);
    com.google.javascript.jscomp.JSError jSError27 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel28 = composeWarningsGuard12.level(jSError27);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = null;
    boolean b30 = composeWarningsGuard12.enables(diagnosticGroup29);
    com.google.javascript.jscomp.JSError jSError31 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel32 = composeWarningsGuard12.level(jSError31);
    com.google.javascript.jscomp.JSError jSError33 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel34 = composeWarningsGuard12.level(jSError33);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup35 = null;
    boolean b36 = composeWarningsGuard12.enables(diagnosticGroup35);
    com.google.javascript.jscomp.JSError jSError37 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel38 = composeWarningsGuard12.level(jSError37);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup39 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard41 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup39, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup42 = null;
    boolean b43 = diagnosticGroupPathSuppressingWarningsGuard41.disables(diagnosticGroup42);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup44 = null;
    boolean b45 = diagnosticGroupPathSuppressingWarningsGuard41.disables(diagnosticGroup44);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup46 = null;
    boolean b47 = diagnosticGroupPathSuppressingWarningsGuard41.disables(diagnosticGroup46);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup48 = null;
    boolean b49 = diagnosticGroupPathSuppressingWarningsGuard41.disables(diagnosticGroup48);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup50 = null;
    boolean b51 = diagnosticGroupPathSuppressingWarningsGuard41.enables(diagnosticGroup50);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup52 = null;
    boolean b53 = diagnosticGroupPathSuppressingWarningsGuard41.enables(diagnosticGroup52);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup54 = null;
    boolean b55 = diagnosticGroupPathSuppressingWarningsGuard41.enables(diagnosticGroup54);
    java.lang.String str56 = diagnosticGroupPathSuppressingWarningsGuard41.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup57 = null;
    boolean b58 = diagnosticGroupPathSuppressingWarningsGuard41.enables(diagnosticGroup57);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup59 = null;
    boolean b60 = diagnosticGroupPathSuppressingWarningsGuard41.disables(diagnosticGroup59);
    java.lang.String str61 = diagnosticGroupPathSuppressingWarningsGuard41.toString();
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array62 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard12, diagnosticGroupPathSuppressingWarningsGuard41 };
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard63 = new com.google.javascript.jscomp.ComposeWarningsGuard(warningsGuard_array62);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "null(OFF)(hi!)"+ "'", str56.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "null(OFF)(hi!)"+ "'", str61.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array62);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test129"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)0, 97, "");

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test130"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    java.lang.String str7 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str8 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str12 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard15 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup13, "");
    java.lang.String str16 = diagnosticGroupPathSuppressingWarningsGuard15.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard15.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard15.disables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard15.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard15.disables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = diagnosticGroupPathSuppressingWarningsGuard15.enables(diagnosticGroup25);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup27 = null;
    boolean b28 = diagnosticGroupPathSuppressingWarningsGuard15.enables(diagnosticGroup27);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = null;
    boolean b30 = diagnosticGroupPathSuppressingWarningsGuard15.enables(diagnosticGroup29);
    java.lang.String str31 = diagnosticGroupPathSuppressingWarningsGuard15.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup32 = null;
    boolean b33 = diagnosticGroupPathSuppressingWarningsGuard15.disables(diagnosticGroup32);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup34 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard36 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup34, "hi!");
    java.lang.String str37 = diagnosticGroupPathSuppressingWarningsGuard36.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup38 = null;
    boolean b39 = diagnosticGroupPathSuppressingWarningsGuard36.enables(diagnosticGroup38);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup40 = null;
    boolean b41 = diagnosticGroupPathSuppressingWarningsGuard36.enables(diagnosticGroup40);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup42 = null;
    boolean b43 = diagnosticGroupPathSuppressingWarningsGuard36.disables(diagnosticGroup42);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup44 = null;
    boolean b45 = diagnosticGroupPathSuppressingWarningsGuard36.disables(diagnosticGroup44);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup46 = null;
    boolean b47 = diagnosticGroupPathSuppressingWarningsGuard36.enables(diagnosticGroup46);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup48 = null;
    boolean b49 = diagnosticGroupPathSuppressingWarningsGuard36.disables(diagnosticGroup48);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup50 = null;
    boolean b51 = diagnosticGroupPathSuppressingWarningsGuard36.enables(diagnosticGroup50);
    java.lang.String str52 = diagnosticGroupPathSuppressingWarningsGuard36.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup53 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard55 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup53, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup56 = null;
    boolean b57 = diagnosticGroupPathSuppressingWarningsGuard55.disables(diagnosticGroup56);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup58 = null;
    boolean b59 = diagnosticGroupPathSuppressingWarningsGuard55.disables(diagnosticGroup58);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup60 = null;
    boolean b61 = diagnosticGroupPathSuppressingWarningsGuard55.disables(diagnosticGroup60);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup62 = null;
    boolean b63 = diagnosticGroupPathSuppressingWarningsGuard55.disables(diagnosticGroup62);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup64 = null;
    boolean b65 = diagnosticGroupPathSuppressingWarningsGuard55.disables(diagnosticGroup64);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup66 = null;
    boolean b67 = diagnosticGroupPathSuppressingWarningsGuard55.enables(diagnosticGroup66);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup68 = null;
    boolean b69 = diagnosticGroupPathSuppressingWarningsGuard55.enables(diagnosticGroup68);
    java.lang.String str70 = diagnosticGroupPathSuppressingWarningsGuard55.toString();
    java.lang.String str71 = diagnosticGroupPathSuppressingWarningsGuard55.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup72 = null;
    boolean b73 = diagnosticGroupPathSuppressingWarningsGuard55.enables(diagnosticGroup72);
    java.lang.String str74 = diagnosticGroupPathSuppressingWarningsGuard55.toString();
    java.lang.String str75 = diagnosticGroupPathSuppressingWarningsGuard55.toString();
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array76 = new com.google.javascript.jscomp.WarningsGuard[] { diagnosticGroupPathSuppressingWarningsGuard2, diagnosticGroupPathSuppressingWarningsGuard15, diagnosticGroupPathSuppressingWarningsGuard36, diagnosticGroupPathSuppressingWarningsGuard55 };
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard77 = new com.google.javascript.jscomp.ComposeWarningsGuard(warningsGuard_array76);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(OFF)(hi!)"+ "'", str7.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(OFF)(hi!)"+ "'", str8.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)(hi!)"+ "'", str11.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(OFF)(hi!)"+ "'", str12.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(OFF)()"+ "'", str16.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null(OFF)()"+ "'", str31.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "null(OFF)(hi!)"+ "'", str37.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "null(OFF)(hi!)"+ "'", str52.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "null(OFF)(hi!)"+ "'", str70.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "null(OFF)(hi!)"+ "'", str71.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "null(OFF)(hi!)"+ "'", str74.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "null(OFF)(hi!)"+ "'", str75.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array76);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test131"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard12.enables(diagnosticGroup13);
    com.google.javascript.jscomp.JSError jSError15 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel16 = composeWarningsGuard12.level(jSError15);
    com.google.javascript.jscomp.JSError jSError17 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel18 = composeWarningsGuard12.level(jSError17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel20 = composeWarningsGuard12.level(jSError19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    com.google.javascript.jscomp.JSError jSError25 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel26 = composeWarningsGuard12.level(jSError25);
    com.google.javascript.jscomp.JSError jSError27 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel28 = composeWarningsGuard12.level(jSError27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel30 = composeWarningsGuard12.level(jSError29);
    com.google.javascript.jscomp.JSError jSError31 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel32 = composeWarningsGuard12.level(jSError31);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup33 = null;
    boolean b34 = composeWarningsGuard12.enables(diagnosticGroup33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test132"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)0, 10, "null(OFF)(null(OFF)())");
    int i4 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getEndingLineNumber();
    java.lang.String str7 = simpleRegion3.getSourceExcerpt();
    int i8 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str5.equals("null(OFF)(null(OFF)())"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str7.equals("null(OFF)(null(OFF)())"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test133"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)-1, 52, "hi!");
    int i4 = simpleRegion3.getEndingLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    int i6 = simpleRegion3.getEndingLineNumber();
    java.lang.String str7 = simpleRegion3.getSourceExcerpt();
    int i8 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test134"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard4 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard5 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard6 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard8 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard9 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard10 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard13.level(jSError14);
    com.google.javascript.jscomp.JSError jSError16 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel17 = composeWarningsGuard13.level(jSError16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard13.level(jSError18);
    com.google.javascript.jscomp.JSError jSError20 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel21 = composeWarningsGuard13.level(jSError20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel23 = composeWarningsGuard13.level(jSError22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = composeWarningsGuard13.enables(diagnosticGroup24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test135"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard12.enables(diagnosticGroup13);
    com.google.javascript.jscomp.JSError jSError15 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel16 = composeWarningsGuard12.level(jSError15);
    com.google.javascript.jscomp.JSError jSError17 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel18 = composeWarningsGuard12.level(jSError17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel20 = composeWarningsGuard12.level(jSError19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = composeWarningsGuard12.enables(diagnosticGroup21);
    com.google.javascript.jscomp.JSError jSError23 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel24 = composeWarningsGuard12.level(jSError23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = composeWarningsGuard12.enables(diagnosticGroup25);
    com.google.javascript.jscomp.JSError jSError27 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel28 = composeWarningsGuard12.level(jSError27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel30 = composeWarningsGuard12.level(jSError29);
    com.google.javascript.jscomp.JSError jSError31 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel32 = composeWarningsGuard12.level(jSError31);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup33 = null;
    boolean b34 = composeWarningsGuard12.enables(diagnosticGroup33);
    com.google.javascript.jscomp.JSError jSError35 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel36 = composeWarningsGuard12.level(jSError35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel36);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test136"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    java.lang.String str7 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup10);
    java.lang.String str12 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup19);
    java.lang.String str21 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(OFF)(hi!)"+ "'", str7.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(OFF)(hi!)"+ "'", str12.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null(OFF)(hi!)"+ "'", str21.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test137"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(52, (int)(short)10, "null(OFF)(hi!)");

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test138"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup16);
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str19 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str20 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup21);
    java.lang.String str23 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str24 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(OFF)(hi!)"+ "'", str19.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null(OFF)(hi!)"+ "'", str20.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null(OFF)(hi!)"+ "'", str23.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null(OFF)(hi!)"+ "'", str24.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test139"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup5);
    java.lang.String str7 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel23 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(OFF)()"+ "'", str7.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test140"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    java.lang.String str19 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup20);
    java.lang.String str22 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    java.lang.String str25 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup26);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup28 = null;
    boolean b29 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup28);
    java.lang.String str30 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str31 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup32 = null;
    boolean b33 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup32);
    com.google.javascript.jscomp.JSError jSError34 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel35 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError34);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(OFF)(hi!)"+ "'", str19.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null(OFF)(hi!)"+ "'", str22.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null(OFF)(hi!)"+ "'", str25.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "null(OFF)(hi!)"+ "'", str30.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null(OFF)(hi!)"+ "'", str31.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test141"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard14 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard15 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard16 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard17 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard18 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard19 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard20 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard20.level(jSError21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard20.enables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b26 = composeWarningsGuard20.disables(diagnosticGroup25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test142"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(100, (int)(short)100, "null(OFF)(hi!)");

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test143"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard13.level(jSError14);
    com.google.javascript.jscomp.JSError jSError16 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel17 = composeWarningsGuard13.level(jSError16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard13.level(jSError18);
    com.google.javascript.jscomp.JSError jSError20 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel21 = composeWarningsGuard13.level(jSError20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = composeWarningsGuard13.enables(diagnosticGroup22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = composeWarningsGuard13.enables(diagnosticGroup24);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = composeWarningsGuard13.enables(diagnosticGroup26);
    com.google.javascript.jscomp.JSError jSError28 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel29 = composeWarningsGuard13.level(jSError28);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array30 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard31 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard31, warningsGuard_array30);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard33 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard31);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard34 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard31);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard35 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard31);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard36 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard31);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard37 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard31);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard38 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard31);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard39 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard31);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup40 = null;
    boolean b41 = composeWarningsGuard39.enables(diagnosticGroup40);
    com.google.javascript.jscomp.JSError jSError42 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel43 = composeWarningsGuard39.level(jSError42);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup44 = null;
    boolean b45 = composeWarningsGuard39.enables(diagnosticGroup44);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup46 = null;
    boolean b47 = composeWarningsGuard39.enables(diagnosticGroup46);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup48 = null;
    boolean b49 = composeWarningsGuard39.enables(diagnosticGroup48);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array50 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard13, composeWarningsGuard39 };
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard51 = new com.google.javascript.jscomp.ComposeWarningsGuard(warningsGuard_array50);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array50);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test144"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(1, (int)(byte)100, "null(OFF)(null(OFF)(null(OFF)()))");
    int i4 = simpleRegion3.getEndingLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    int i6 = simpleRegion3.getEndingLineNumber();
    java.lang.String str7 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(OFF)(null(OFF)(null(OFF)()))"+ "'", str7.equals("null(OFF)(null(OFF)(null(OFF)()))"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test145"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str10 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup12);
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup15);
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(hi!)"+ "'", str9.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(OFF)(hi!)"+ "'", str10.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)(hi!)"+ "'", str11.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)(hi!)"+ "'", str14.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)(hi!)"+ "'", str17.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test146"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(10, (int)' ', "null(OFF)(null(OFF)(hi!))");
    int i4 = simpleRegion3.getBeginningLineNumber();
    int i5 = simpleRegion3.getBeginningLineNumber();
    int i6 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test147"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup6);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test148"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)1, (int)(byte)100, "");
    int i4 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test149"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(1, (int)(byte)10, "");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test150"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.JSError jSError4 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel5 = composeWarningsGuard3.level(jSError4);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = composeWarningsGuard3.enables(diagnosticGroup6);
    com.google.javascript.jscomp.JSError jSError8 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel9 = composeWarningsGuard3.level(jSError8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = composeWarningsGuard3.enables(diagnosticGroup10);
    com.google.javascript.jscomp.JSError jSError12 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel13 = composeWarningsGuard3.level(jSError12);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard3.level(jSError14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard3.enables(diagnosticGroup16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard3.level(jSError18);
    com.google.javascript.jscomp.JSError jSError20 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel21 = composeWarningsGuard3.level(jSError20);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = composeWarningsGuard3.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel21);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test151"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(byte)1, (int)'a', "");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getEndingLineNumber();
    int i7 = simpleRegion3.getEndingLineNumber();
    int i8 = simpleRegion3.getBeginningLineNumber();
    int i9 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test152"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(10, (-1), "null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!))))");
    int i4 = simpleRegion3.getEndingLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!))))"+ "'", str5.equals("null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!))))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test153"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    java.lang.String str19 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup20);
    java.lang.String str22 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    java.lang.String str25 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup26);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup28 = null;
    boolean b29 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup28);
    java.lang.String str30 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str31 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup32 = null;
    boolean b33 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup32);
    java.lang.String str34 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(OFF)(hi!)"+ "'", str19.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null(OFF)(hi!)"+ "'", str22.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null(OFF)(hi!)"+ "'", str25.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "null(OFF)(hi!)"+ "'", str30.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null(OFF)(hi!)"+ "'", str31.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "null(OFF)(hi!)"+ "'", str34.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test154"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(byte)0, 32, "");
    int i4 = simpleRegion3.getBeginningLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    java.lang.String str6 = simpleRegion3.getSourceExcerpt();
    int i7 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test155"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard14 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard15 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard16 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard17 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard18 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard19 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard19.enables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = composeWarningsGuard19.enables(diagnosticGroup22);
    com.google.javascript.jscomp.JSError jSError24 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel25 = composeWarningsGuard19.level(jSError24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel25);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test156"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(52, 97, "");
    int i4 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test157"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(10, 0, "");
    int i4 = simpleRegion3.getEndingLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test158"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = composeWarningsGuard13.enables(diagnosticGroup14);
    com.google.javascript.jscomp.JSError jSError16 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel17 = composeWarningsGuard13.level(jSError16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = composeWarningsGuard13.enables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard13.enables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = composeWarningsGuard13.enables(diagnosticGroup22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = composeWarningsGuard13.enables(diagnosticGroup24);
    com.google.javascript.jscomp.JSError jSError26 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel27 = composeWarningsGuard13.level(jSError26);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup28 = null;
    boolean b29 = composeWarningsGuard13.enables(diagnosticGroup28);
    com.google.javascript.jscomp.JSError jSError30 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel31 = composeWarningsGuard13.level(jSError30);
    com.google.javascript.jscomp.JSError jSError32 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel33 = composeWarningsGuard13.level(jSError32);
    com.google.javascript.jscomp.JSError jSError34 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel35 = composeWarningsGuard13.level(jSError34);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup36 = null;
    boolean b37 = composeWarningsGuard13.enables(diagnosticGroup36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test159"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup6);
    java.lang.String str8 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)(hi!)"+ "'", str3.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(OFF)(hi!)"+ "'", str8.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(hi!)"+ "'", str9.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test160"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)()");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup6);
    java.lang.String str8 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.JSError jSError10 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel11 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str5.equals("null(OFF)(null(OFF)())"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str8.equals("null(OFF)(null(OFF)())"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str9.equals("null(OFF)(null(OFF)())"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test161"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(0, (int)(byte)10, "");
    int i4 = simpleRegion3.getBeginningLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    java.lang.String str6 = simpleRegion3.getSourceExcerpt();
    java.lang.String str7 = simpleRegion3.getSourceExcerpt();
    int i8 = simpleRegion3.getEndingLineNumber();
    java.lang.String str9 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test162"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    java.lang.String str16 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    java.lang.String str25 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str26 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(OFF)(hi!)"+ "'", str16.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null(OFF)(hi!)"+ "'", str25.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null(OFF)(hi!)"+ "'", str26.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test163"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(0, 0, "");
    int i4 = simpleRegion3.getEndingLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str7 = simpleRegion3.getSourceExcerpt();
    int i8 = simpleRegion3.getEndingLineNumber();
    java.lang.String str9 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test164"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str15 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str16 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup19);
    java.lang.String str21 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup22);
    java.lang.String str24 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)()"+ "'", str3.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)()"+ "'", str6.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)()"+ "'", str11.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)()"+ "'", str14.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(OFF)()"+ "'", str15.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(OFF)()"+ "'", str16.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null(OFF)()"+ "'", str21.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null(OFF)()"+ "'", str24.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test165"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    java.lang.String str9 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str10 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str12 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(OFF)(hi!)"+ "'", str9.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(OFF)(hi!)"+ "'", str10.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)(hi!)"+ "'", str11.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(OFF)(hi!)"+ "'", str12.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test166"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(97, (int)(byte)100, "null(OFF)()");

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test167"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    java.lang.String str15 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str16 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    java.lang.String str19 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(OFF)(hi!)"+ "'", str15.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(OFF)(hi!)"+ "'", str16.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(OFF)(hi!)"+ "'", str19.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test168"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(byte)100, (int)' ', "null(OFF)()");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(OFF)()"+ "'", str4.equals("null(OFF)()"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test169"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup22);
    java.lang.String str24 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup25);
    com.google.javascript.jscomp.JSError jSError27 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel28 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null(OFF)(hi!)"+ "'", str24.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test170"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup16);
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test171"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(97, 32, "null(OFF)(null(OFF)())");
    int i4 = simpleRegion3.getBeginningLineNumber();
    int i5 = simpleRegion3.getBeginningLineNumber();
    int i6 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test172"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)(hi!)");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test173"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup6);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup10);
    java.lang.String str12 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(OFF)(hi!)"+ "'", str12.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test174"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)'#', (int)(short)100, "null(OFF)(hi!)");

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test175"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(byte)1, (int)'a', "");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    java.lang.String str6 = simpleRegion3.getSourceExcerpt();
    int i7 = simpleRegion3.getBeginningLineNumber();
    int i8 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test176"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)1, (int)(byte)10, "null(OFF)(null(OFF)())");
    int i4 = simpleRegion3.getEndingLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    int i6 = simpleRegion3.getEndingLineNumber();
    java.lang.String str7 = simpleRegion3.getSourceExcerpt();
    java.lang.String str8 = simpleRegion3.getSourceExcerpt();
    int i9 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str10 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str7.equals("null(OFF)(null(OFF)())"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str8.equals("null(OFF)(null(OFF)())"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str10.equals("null(OFF)(null(OFF)())"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test177"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(0, 0, "");
    int i4 = simpleRegion3.getEndingLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str7 = simpleRegion3.getSourceExcerpt();
    int i8 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test178"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((-1), 1, "null(OFF)(hi!)");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    int i5 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str6 = simpleRegion3.getSourceExcerpt();
    int i7 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(OFF)(hi!)"+ "'", str4.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test179"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(0, 0, "null(OFF)(null(OFF)(null(OFF)(null(OFF)())))");
    int i4 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test180"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(byte)100, (int)(short)1, "hi!");
    int i4 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test181"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)0, 32, "null(OFF)()");
    int i4 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test182"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(0, 32, "null(OFF)(null(OFF)(null(OFF)(null(OFF)())))");
    int i4 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test183"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    java.lang.String str19 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(OFF)(hi!)"+ "'", str19.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test184"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup6);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup10);
    java.lang.String str12 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)(hi!)"+ "'", str3.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(OFF)(hi!)"+ "'", str12.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)(hi!)"+ "'", str14.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test185"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((-1), (int)' ', "");
    int i4 = simpleRegion3.getEndingLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test186"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    java.lang.String str19 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str20 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(OFF)(hi!)"+ "'", str19.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null(OFF)(hi!)"+ "'", str20.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test187"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard14 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard15 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard16 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard17 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard18 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard19 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard20 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard21 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard22 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard23 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = composeWarningsGuard23.enables(diagnosticGroup24);
    com.google.javascript.jscomp.JSError jSError26 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel27 = composeWarningsGuard23.level(jSError26);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup28 = null;
    boolean b29 = composeWarningsGuard23.enables(diagnosticGroup28);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup30 = null;
    boolean b31 = composeWarningsGuard23.enables(diagnosticGroup30);
    com.google.javascript.jscomp.JSError jSError32 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel33 = composeWarningsGuard23.level(jSError32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel33);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test188"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard11.enables(diagnosticGroup12);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard11.level(jSError14);
    com.google.javascript.jscomp.JSError jSError16 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel17 = composeWarningsGuard11.level(jSError16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = composeWarningsGuard11.enables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard11.enables(diagnosticGroup20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel23 = composeWarningsGuard11.level(jSError22);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = composeWarningsGuard11.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel23);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test189"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard14 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard15 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard16 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = composeWarningsGuard16.enables(diagnosticGroup17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel20 = composeWarningsGuard16.level(jSError19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = composeWarningsGuard16.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard16.enables(diagnosticGroup23);
    com.google.javascript.jscomp.JSError jSError25 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel26 = composeWarningsGuard16.level(jSError25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel26);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test190"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test191"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard13.level(jSError14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard13.enables(diagnosticGroup16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard13.level(jSError18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard13.enables(diagnosticGroup20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel23 = composeWarningsGuard13.level(jSError22);
    com.google.javascript.jscomp.JSError jSError24 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel25 = composeWarningsGuard13.level(jSError24);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = composeWarningsGuard13.enables(diagnosticGroup26);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup28 = null;
    boolean b29 = composeWarningsGuard13.enables(diagnosticGroup28);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup30 = null;
    boolean b31 = composeWarningsGuard13.enables(diagnosticGroup30);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup32 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard34 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup32, "hi!");
    java.lang.String str35 = diagnosticGroupPathSuppressingWarningsGuard34.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup36 = null;
    boolean b37 = diagnosticGroupPathSuppressingWarningsGuard34.enables(diagnosticGroup36);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup38 = null;
    boolean b39 = diagnosticGroupPathSuppressingWarningsGuard34.enables(diagnosticGroup38);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup40 = null;
    boolean b41 = diagnosticGroupPathSuppressingWarningsGuard34.disables(diagnosticGroup40);
    java.lang.String str42 = diagnosticGroupPathSuppressingWarningsGuard34.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup43 = null;
    boolean b44 = diagnosticGroupPathSuppressingWarningsGuard34.enables(diagnosticGroup43);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup45 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard47 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup45, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup48 = null;
    boolean b49 = diagnosticGroupPathSuppressingWarningsGuard47.disables(diagnosticGroup48);
    java.lang.String str50 = diagnosticGroupPathSuppressingWarningsGuard47.toString();
    java.lang.String str51 = diagnosticGroupPathSuppressingWarningsGuard47.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup52 = null;
    boolean b53 = diagnosticGroupPathSuppressingWarningsGuard47.enables(diagnosticGroup52);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup54 = null;
    boolean b55 = diagnosticGroupPathSuppressingWarningsGuard47.enables(diagnosticGroup54);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup56 = null;
    boolean b57 = diagnosticGroupPathSuppressingWarningsGuard47.disables(diagnosticGroup56);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup58 = null;
    boolean b59 = diagnosticGroupPathSuppressingWarningsGuard47.enables(diagnosticGroup58);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup60 = null;
    boolean b61 = diagnosticGroupPathSuppressingWarningsGuard47.disables(diagnosticGroup60);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup62 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard64 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup62, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup65 = null;
    boolean b66 = diagnosticGroupPathSuppressingWarningsGuard64.disables(diagnosticGroup65);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup67 = null;
    boolean b68 = diagnosticGroupPathSuppressingWarningsGuard64.disables(diagnosticGroup67);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup69 = null;
    boolean b70 = diagnosticGroupPathSuppressingWarningsGuard64.disables(diagnosticGroup69);
    java.lang.String str71 = diagnosticGroupPathSuppressingWarningsGuard64.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup72 = null;
    boolean b73 = diagnosticGroupPathSuppressingWarningsGuard64.enables(diagnosticGroup72);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup74 = null;
    boolean b75 = diagnosticGroupPathSuppressingWarningsGuard64.enables(diagnosticGroup74);
    java.lang.String str76 = diagnosticGroupPathSuppressingWarningsGuard64.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup77 = null;
    boolean b78 = diagnosticGroupPathSuppressingWarningsGuard64.disables(diagnosticGroup77);
    java.lang.String str79 = diagnosticGroupPathSuppressingWarningsGuard64.toString();
    java.lang.String str80 = diagnosticGroupPathSuppressingWarningsGuard64.toString();
    java.lang.String str81 = diagnosticGroupPathSuppressingWarningsGuard64.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup82 = null;
    boolean b83 = diagnosticGroupPathSuppressingWarningsGuard64.disables(diagnosticGroup82);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup84 = null;
    boolean b85 = diagnosticGroupPathSuppressingWarningsGuard64.disables(diagnosticGroup84);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array86 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard13, diagnosticGroupPathSuppressingWarningsGuard34, diagnosticGroupPathSuppressingWarningsGuard47, diagnosticGroupPathSuppressingWarningsGuard64 };
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard87 = new com.google.javascript.jscomp.ComposeWarningsGuard(warningsGuard_array86);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "null(OFF)(hi!)"+ "'", str35.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "null(OFF)(hi!)"+ "'", str42.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "null(OFF)(hi!)"+ "'", str50.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "null(OFF)(hi!)"+ "'", str51.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "null(OFF)(hi!)"+ "'", str71.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "null(OFF)(hi!)"+ "'", str76.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "null(OFF)(hi!)"+ "'", str79.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "null(OFF)(hi!)"+ "'", str80.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "null(OFF)(hi!)"+ "'", str81.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array86);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test192"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(byte)100, (int)(byte)-1, "null(OFF)()");

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test193"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard11.enables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = composeWarningsGuard11.enables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard11.enables(diagnosticGroup16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard11.level(jSError18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard11.enables(diagnosticGroup20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel23 = composeWarningsGuard11.level(jSError22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = composeWarningsGuard11.enables(diagnosticGroup24);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = composeWarningsGuard11.enables(diagnosticGroup26);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup28 = null;
    boolean b29 = composeWarningsGuard11.enables(diagnosticGroup28);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup30 = null;
    boolean b31 = composeWarningsGuard11.enables(diagnosticGroup30);
    com.google.javascript.jscomp.JSError jSError32 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel33 = composeWarningsGuard11.level(jSError32);
    com.google.javascript.jscomp.JSError jSError34 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel35 = composeWarningsGuard11.level(jSError34);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup36 = null;
    boolean b37 = composeWarningsGuard11.enables(diagnosticGroup36);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup38 = null;
    boolean b39 = composeWarningsGuard11.enables(diagnosticGroup38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test194"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)'#', 0, "hi!");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    int i5 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test195"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str15 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str16 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup19);
    java.lang.String str21 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup22);
    java.lang.String str24 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.JSError jSError25 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel26 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)()"+ "'", str3.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)()"+ "'", str6.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)()"+ "'", str11.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)()"+ "'", str14.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(OFF)()"+ "'", str15.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(OFF)()"+ "'", str16.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null(OFF)()"+ "'", str21.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null(OFF)()"+ "'", str24.equals("null(OFF)()"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test196"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard11.enables(diagnosticGroup12);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard11.level(jSError14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard11.enables(diagnosticGroup16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard11.level(jSError18);
    com.google.javascript.jscomp.JSError jSError20 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel21 = composeWarningsGuard11.level(jSError20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel23 = composeWarningsGuard11.level(jSError22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = composeWarningsGuard11.disables(diagnosticGroup24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel23);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test197"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup6);
    java.lang.String str8 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)()"+ "'", str5.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(OFF)()"+ "'", str8.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)()"+ "'", str13.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test198"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard12.enables(diagnosticGroup13);
    com.google.javascript.jscomp.JSError jSError15 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel16 = composeWarningsGuard12.level(jSError15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = composeWarningsGuard12.enables(diagnosticGroup17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel20 = composeWarningsGuard12.level(jSError19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = composeWarningsGuard12.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = composeWarningsGuard12.enables(diagnosticGroup23);
    com.google.javascript.jscomp.JSError jSError25 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel26 = composeWarningsGuard12.level(jSError25);
    com.google.javascript.jscomp.JSError jSError27 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel28 = composeWarningsGuard12.level(jSError27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel30 = composeWarningsGuard12.level(jSError29);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup31 = null;
    boolean b32 = composeWarningsGuard12.enables(diagnosticGroup31);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup33 = null;
    boolean b34 = composeWarningsGuard12.enables(diagnosticGroup33);
    com.google.javascript.jscomp.JSError jSError35 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel36 = composeWarningsGuard12.level(jSError35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel36);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test199"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)'#', 0, "hi!");
    int i4 = simpleRegion3.getBeginningLineNumber();
    int i5 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str6 = simpleRegion3.getSourceExcerpt();
    int i7 = simpleRegion3.getEndingLineNumber();
    int i8 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test200"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError13 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel14 = composeWarningsGuard12.level(jSError13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = composeWarningsGuard12.enables(diagnosticGroup15);
    com.google.javascript.jscomp.JSError jSError17 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel18 = composeWarningsGuard12.level(jSError17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel20 = composeWarningsGuard12.level(jSError19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.JSError jSError23 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel24 = composeWarningsGuard12.level(jSError23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = composeWarningsGuard12.enables(diagnosticGroup25);
    com.google.javascript.jscomp.JSError jSError27 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel28 = composeWarningsGuard12.level(jSError27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel30 = composeWarningsGuard12.level(jSError29);
    com.google.javascript.jscomp.JSError jSError31 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel32 = composeWarningsGuard12.level(jSError31);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup33 = null;
    boolean b34 = composeWarningsGuard12.enables(diagnosticGroup33);
    com.google.javascript.jscomp.JSError jSError35 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel36 = composeWarningsGuard12.level(jSError35);
    com.google.javascript.jscomp.JSError jSError37 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel38 = composeWarningsGuard12.level(jSError37);
    com.google.javascript.jscomp.JSError jSError39 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel40 = composeWarningsGuard12.level(jSError39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel40);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test201"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard13.level(jSError14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard13.enables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = composeWarningsGuard13.enables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard13.enables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = composeWarningsGuard13.enables(diagnosticGroup22);
    com.google.javascript.jscomp.JSError jSError24 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel25 = composeWarningsGuard13.level(jSError24);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = composeWarningsGuard13.enables(diagnosticGroup26);
    com.google.javascript.jscomp.JSError jSError28 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel29 = composeWarningsGuard13.level(jSError28);
    com.google.javascript.jscomp.JSError jSError30 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel31 = composeWarningsGuard13.level(jSError30);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup32 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b33 = composeWarningsGuard13.disables(diagnosticGroup32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel31);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test202"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(100, (int)(byte)100, "");
    int i4 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getEndingLineNumber();
    int i7 = simpleRegion3.getEndingLineNumber();
    java.lang.String str8 = simpleRegion3.getSourceExcerpt();
    int i9 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test203"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)(null(OFF)(hi!))");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup6);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup8 = null;
    boolean b9 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(hi!)))"+ "'", str3.equals("null(OFF)(null(OFF)(null(OFF)(hi!)))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test204"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard4 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = composeWarningsGuard4.enables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = composeWarningsGuard4.enables(diagnosticGroup7);
    com.google.javascript.jscomp.JSError jSError9 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel10 = composeWarningsGuard4.level(jSError9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = composeWarningsGuard4.enables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard4.enables(diagnosticGroup13);
    com.google.javascript.jscomp.JSError jSError15 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel16 = composeWarningsGuard4.level(jSError15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel16);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test205"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)0, (-1), "null(OFF)()");
    int i4 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test206"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(1, (int)(byte)1, "null(OFF)(null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!)))))");

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test207"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup14);
    java.lang.String str16 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup25);
    java.lang.String str27 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(OFF)(hi!)"+ "'", str16.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "null(OFF)(hi!)"+ "'", str27.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test208"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "");
    java.lang.String str3 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    boolean b5 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup4);
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup12);
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(OFF)()"+ "'", str3.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)()"+ "'", str6.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)()"+ "'", str11.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)()"+ "'", str14.equals("null(OFF)()"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test209"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard14 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard15 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard15.enables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = composeWarningsGuard15.enables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = composeWarningsGuard15.enables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = composeWarningsGuard15.enables(diagnosticGroup22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test210"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "null(OFF)()");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup15);
    java.lang.String str17 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(OFF)(null(OFF)())"+ "'", str17.equals("null(OFF)(null(OFF)())"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test211"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    boolean b23 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup22);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = null;
    boolean b25 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup24);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test212"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard11 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup9, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard11.disables(diagnosticGroup12);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard11.enables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard11.disables(diagnosticGroup16);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = null;
    boolean b19 = diagnosticGroupPathSuppressingWarningsGuard11.disables(diagnosticGroup18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup20 = null;
    boolean b21 = diagnosticGroupPathSuppressingWarningsGuard11.enables(diagnosticGroup20);
    java.lang.String str22 = diagnosticGroupPathSuppressingWarningsGuard11.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard11.enables(diagnosticGroup23);
    java.lang.String str25 = diagnosticGroupPathSuppressingWarningsGuard11.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup26 = null;
    boolean b27 = diagnosticGroupPathSuppressingWarningsGuard11.enables(diagnosticGroup26);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup28 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard30 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup28, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup31 = null;
    boolean b32 = diagnosticGroupPathSuppressingWarningsGuard30.disables(diagnosticGroup31);
    java.lang.String str33 = diagnosticGroupPathSuppressingWarningsGuard30.toString();
    java.lang.String str34 = diagnosticGroupPathSuppressingWarningsGuard30.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup35 = null;
    boolean b36 = diagnosticGroupPathSuppressingWarningsGuard30.enables(diagnosticGroup35);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup37 = null;
    boolean b38 = diagnosticGroupPathSuppressingWarningsGuard30.enables(diagnosticGroup37);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup39 = null;
    boolean b40 = diagnosticGroupPathSuppressingWarningsGuard30.disables(diagnosticGroup39);
    java.lang.String str41 = diagnosticGroupPathSuppressingWarningsGuard30.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup42 = null;
    boolean b43 = diagnosticGroupPathSuppressingWarningsGuard30.enables(diagnosticGroup42);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup44 = null;
    boolean b45 = diagnosticGroupPathSuppressingWarningsGuard30.enables(diagnosticGroup44);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup46 = null;
    boolean b47 = diagnosticGroupPathSuppressingWarningsGuard30.enables(diagnosticGroup46);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup48 = null;
    boolean b49 = diagnosticGroupPathSuppressingWarningsGuard30.enables(diagnosticGroup48);
    java.lang.String str50 = diagnosticGroupPathSuppressingWarningsGuard30.toString();
    java.lang.String str51 = diagnosticGroupPathSuppressingWarningsGuard30.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup52 = null;
    boolean b53 = diagnosticGroupPathSuppressingWarningsGuard30.enables(diagnosticGroup52);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup54 = null;
    boolean b55 = diagnosticGroupPathSuppressingWarningsGuard30.disables(diagnosticGroup54);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup56 = null;
    boolean b57 = diagnosticGroupPathSuppressingWarningsGuard30.disables(diagnosticGroup56);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array58 = new com.google.javascript.jscomp.WarningsGuard[] { diagnosticGroupPathSuppressingWarningsGuard2, diagnosticGroupPathSuppressingWarningsGuard11, diagnosticGroupPathSuppressingWarningsGuard30 };
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard59 = new com.google.javascript.jscomp.ComposeWarningsGuard(warningsGuard_array58);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null(OFF)(hi!)"+ "'", str22.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null(OFF)(hi!)"+ "'", str25.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "null(OFF)(hi!)"+ "'", str33.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "null(OFF)(hi!)"+ "'", str34.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "null(OFF)(hi!)"+ "'", str41.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "null(OFF)(hi!)"+ "'", str50.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "null(OFF)(hi!)"+ "'", str51.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array58);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test213"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)' ', 100, "null(OFF)(hi!)");
    int i4 = simpleRegion3.getBeginningLineNumber();
    java.lang.String str5 = simpleRegion3.getSourceExcerpt();
    int i6 = simpleRegion3.getBeginningLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test214"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(100, (int)(byte)0, "null(OFF)(null(OFF)(hi!))");

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test215"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(0, (int)'4', "null(OFF)(null(OFF)())");

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test216"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)'4', 0, "null(OFF)(hi!)");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(OFF)(hi!)"+ "'", str4.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test217"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    java.lang.String str13 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = null;
    boolean b15 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup16);
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup21);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = null;
    boolean b24 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup25);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup27 = null;
    boolean b28 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel30 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(OFF)(hi!)"+ "'", str13.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test218"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard14 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard15 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard15.enables(diagnosticGroup16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard15.level(jSError18);
    com.google.javascript.jscomp.JSError jSError20 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel21 = composeWarningsGuard15.level(jSError20);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup22 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = composeWarningsGuard15.disables(diagnosticGroup22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel21);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test219"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(1, (int)' ', "");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    int i5 = simpleRegion3.getEndingLineNumber();
    int i6 = simpleRegion3.getEndingLineNumber();
    int i7 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test220"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion(52, (int)(byte)1, "null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!))))");
    int i4 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test221"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = null;
    boolean b16 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.javascript.jscomp.CheckLevel checkLevel20 = diagnosticGroupPathSuppressingWarningsGuard2.level(jSError19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test222"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(byte)-1, (int)(short)100, "null(OFF)(null(OFF)(null(OFF)(null(OFF)(hi!))))");
    int i4 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test223"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = null;
    boolean b6 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup5);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = null;
    boolean b12 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup11);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup13);
    java.lang.String str15 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str16 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup17);
    java.lang.String str19 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str20 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(OFF)(hi!)"+ "'", str15.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(OFF)(hi!)"+ "'", str16.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(OFF)(hi!)"+ "'", str19.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null(OFF)(hi!)"+ "'", str20.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test224"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)100, (int)(byte)10, "null(OFF)(hi!)");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(OFF)(hi!)"+ "'", str4.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test225"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(short)0, (int)(short)0, "");

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test226"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)'a', (int)(byte)10, "");
    java.lang.String str4 = simpleRegion3.getSourceExcerpt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test227"); }

    com.google.javascript.jscomp.SimpleRegion simpleRegion3 = new com.google.javascript.jscomp.SimpleRegion((int)(byte)1, (int)'a', "null(OFF)(null(OFF)(null(OFF)(hi!)))");
    int i4 = simpleRegion3.getBeginningLineNumber();
    int i5 = simpleRegion3.getEndingLineNumber();
    java.lang.String str6 = simpleRegion3.getSourceExcerpt();
    int i7 = simpleRegion3.getBeginningLineNumber();
    int i8 = simpleRegion3.getEndingLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(null(OFF)(null(OFF)(hi!)))"+ "'", str6.equals("null(OFF)(null(OFF)(null(OFF)(hi!)))"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test228"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup13 = null;
    boolean b14 = composeWarningsGuard12.enables(diagnosticGroup13);
    com.google.javascript.jscomp.JSError jSError15 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel16 = composeWarningsGuard12.level(jSError15);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = null;
    boolean b18 = composeWarningsGuard12.enables(diagnosticGroup17);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = null;
    boolean b20 = composeWarningsGuard12.enables(diagnosticGroup19);
    com.google.javascript.jscomp.JSError jSError21 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel22 = composeWarningsGuard12.level(jSError21);
    com.google.javascript.jscomp.JSError jSError23 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel24 = composeWarningsGuard12.level(jSError23);
    com.google.javascript.jscomp.JSError jSError25 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel26 = composeWarningsGuard12.level(jSError25);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup27 = null;
    boolean b28 = composeWarningsGuard12.enables(diagnosticGroup27);
    com.google.javascript.jscomp.JSError jSError29 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel30 = composeWarningsGuard12.level(jSError29);
    com.google.javascript.jscomp.JSError jSError31 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel32 = composeWarningsGuard12.level(jSError31);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup33 = null;
    boolean b34 = composeWarningsGuard12.enables(diagnosticGroup33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test229"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard6 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup4, "hi!");
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array7 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard8 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard8, warningsGuard_array7);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard10 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard8);
    com.google.javascript.jscomp.JSError jSError11 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel12 = composeWarningsGuard10.level(jSError11);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array13 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard14 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard14, warningsGuard_array13);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard16 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard14);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array17 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, diagnosticGroupPathSuppressingWarningsGuard6, composeWarningsGuard10, composeWarningsGuard16 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard18 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18, warningsGuard_array17);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard20 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard21 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard22 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard23 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard24 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard25 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard26 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard27 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard28 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard29 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard30 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard31 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard32 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard33 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard34 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard35 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard36 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard37 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard38 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard39 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard40 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard41 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard42 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard43 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard44 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard45 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard46 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard47 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard48 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard49 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard50 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard51 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard52 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard53 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard54 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard18);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup55 = null;
    boolean b56 = composeWarningsGuard54.enables(diagnosticGroup55);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup57 = null;
    boolean b58 = composeWarningsGuard54.enables(diagnosticGroup57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test230"); }

    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
    com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard diagnosticGroupPathSuppressingWarningsGuard2 = new com.google.javascript.jscomp.DiagnosticGroupPathSuppressingWarningsGuard(diagnosticGroup0, "hi!");
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = null;
    boolean b4 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup3);
    java.lang.String str5 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str6 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = null;
    boolean b8 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup7);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup9 = null;
    boolean b10 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup9);
    java.lang.String str11 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = diagnosticGroupPathSuppressingWarningsGuard2.enables(diagnosticGroup12);
    java.lang.String str14 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str15 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = diagnosticGroupPathSuppressingWarningsGuard2.disables(diagnosticGroup16);
    java.lang.String str18 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    java.lang.String str19 = diagnosticGroupPathSuppressingWarningsGuard2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(OFF)(hi!)"+ "'", str5.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(OFF)(hi!)"+ "'", str6.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(OFF)(hi!)"+ "'", str11.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(OFF)(hi!)"+ "'", str14.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(OFF)(hi!)"+ "'", str15.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(OFF)(hi!)"+ "'", str18.equals("null(OFF)(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(OFF)(hi!)"+ "'", str19.equals("null(OFF)(hi!)"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test231"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.JSError jSError4 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel5 = composeWarningsGuard3.level(jSError4);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = null;
    boolean b7 = composeWarningsGuard3.enables(diagnosticGroup6);
    com.google.javascript.jscomp.JSError jSError8 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel9 = composeWarningsGuard3.level(jSError8);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = null;
    boolean b11 = composeWarningsGuard3.enables(diagnosticGroup10);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = null;
    boolean b13 = composeWarningsGuard3.enables(diagnosticGroup12);
    com.google.javascript.jscomp.JSError jSError14 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel15 = composeWarningsGuard3.level(jSError14);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup16 = null;
    boolean b17 = composeWarningsGuard3.enables(diagnosticGroup16);
    com.google.javascript.jscomp.JSError jSError18 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel19 = composeWarningsGuard3.level(jSError18);
    com.google.javascript.jscomp.JSError jSError20 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel21 = composeWarningsGuard3.level(jSError20);
    com.google.javascript.jscomp.JSError jSError22 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel23 = composeWarningsGuard3.level(jSError22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel23);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test232"); }

    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array0 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard1 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1, warningsGuard_array0);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard3 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard1);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array4 = new com.google.javascript.jscomp.WarningsGuard[] {  };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard5 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5, warningsGuard_array4);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard7 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard5);
    com.google.javascript.jscomp.WarningsGuard[] warningsGuard_array8 = new com.google.javascript.jscomp.WarningsGuard[] { composeWarningsGuard3, composeWarningsGuard7 };
    java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard> arraylist_warningsGuard9 = new java.util.ArrayList<com.google.javascript.jscomp.WarningsGuard>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9, warningsGuard_array8);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard11 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard12 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard13 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard14 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard15 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard16 = new com.google.javascript.jscomp.ComposeWarningsGuard((java.util.List<com.google.javascript.jscomp.WarningsGuard>)arraylist_warningsGuard9);
    com.google.javascript.jscomp.JSError jSError17 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel18 = composeWarningsGuard16.level(jSError17);
    com.google.javascript.jscomp.JSError jSError19 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel20 = composeWarningsGuard16.level(jSError19);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = null;
    boolean b22 = composeWarningsGuard16.enables(diagnosticGroup21);
    com.google.javascript.jscomp.JSError jSError23 = null;
    com.google.javascript.jscomp.CheckLevel checkLevel24 = composeWarningsGuard16.level(jSError23);
    com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = null;
    boolean b26 = composeWarningsGuard16.enables(diagnosticGroup25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(warningsGuard_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(checkLevel24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

}
