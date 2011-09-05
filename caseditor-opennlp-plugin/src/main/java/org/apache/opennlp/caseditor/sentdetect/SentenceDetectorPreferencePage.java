/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.opennlp.caseditor.sentdetect;

import org.apache.opennlp.caseditor.OpenNLPPlugin;
import org.apache.opennlp.caseditor.OpenNLPPreferenceConstants;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class SentenceDetectorPreferencePage extends FieldEditorPreferencePage
    implements IWorkbenchPreferencePage {

  public SentenceDetectorPreferencePage() {
    setPreferenceStore(OpenNLPPlugin.getDefault().getPreferenceStore());
    setDescription("Sentence Detector Preferences.");
  }
  
  @Override
  public void init(IWorkbench workbench) {
  }

  @Override
  protected void createFieldEditors() {
    StringFieldEditor modelPath = new StringFieldEditor(
        OpenNLPPreferenceConstants.SENTENCE_DETECTOR_MODEL_PATH,
        "Model Path", getFieldEditorParent());
    addField(modelPath);
    
    StringFieldEditor paragraphType = new StringFieldEditor(
        OpenNLPPreferenceConstants.PARAGRAPH_TYPE,
        "Paragraph Type", getFieldEditorParent());
    addField(paragraphType);
  }
}
