/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umich.ms.test.autoupdate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "umich.ms.test.autoupdate.ShowDialogAction"
)
@ActionRegistration(
        iconBase = "umich/ms/test/autoupdate/icon-ms.png",
        displayName = "#CTL_ShowDialogAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1300, separatorAfter = 1350),
    @ActionReference(path = "Toolbars/File", position = 300)
})
@Messages("CTL_ShowDialogAction=Display Notice!")
public final class ShowDialogAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        NotifyDescriptor.Message message = new NotifyDescriptor.Message("Original message text");
        DialogDisplayer.getDefault().notifyLater(message);

    }
}
