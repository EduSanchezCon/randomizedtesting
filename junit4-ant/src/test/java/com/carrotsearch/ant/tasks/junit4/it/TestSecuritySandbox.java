package com.carrotsearch.ant.tasks.junit4.it;


import com.carrotsearch.ant.tasks.junit4.tests.FailInAfterClass;
import com.carrotsearch.ant.tasks.junit4.tests.ReasonForAssumptionIgnored;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

/**
 * Test report-text listener.
 */
public class TestSecuritySandbox extends JUnit4XmlTestBase {
  @Test
  public void gh255() {
    super.executeTarget("gh255");

    String log = getLog();
    assertLogContains("access denied (\"java.util.PropertyPermission\" \"foo\" \"write\")");
  }
}
