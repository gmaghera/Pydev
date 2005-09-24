/*
 * License: Common Public License v1.0
 * Created on 25/08/2005
 * 
 * @author Fabio Zadrozny
 */
package com.python.pydev.codecompletion.participant;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.python.pydev.editor.codecompletion.PyCodeCompletion;

import com.python.pydev.analysis.additionalinfo.AdditionalInfoTestsBase;

public class CompletionParticipantTest extends AdditionalInfoTestsBase {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(CompletionParticipantTest.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        participant = new ImportsCompletionParticipant();
        codeCompletion = new PyCodeCompletion();
        super.restorePythonPath(false);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testImportCompletion() throws CoreException, BadLocationException {
        requestCompl("unittest", new String[]{"unittest", "unittest - testlib"});
    }

}
