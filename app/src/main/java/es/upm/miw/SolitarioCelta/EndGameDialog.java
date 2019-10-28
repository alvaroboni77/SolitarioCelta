package es.upm.miw.SolitarioCelta;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.DialogFragment;

public class EndGameDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final MainActivity main = (MainActivity) getActivity();

        AlertDialog.Builder builder = new AlertDialog.Builder(main);
        builder
                .setTitle(R.string.txtDialogoAbandonarTitulo)
                .setMessage(R.string.txtDialogoAbandonarPregunta)
                .setPositiveButton(
                        R.string.txtDialogoAbandonarAfirmativo,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                main.recuperarFichero();
                            }
                        }
                )
                .setNegativeButton(
                        getString(R.string.txtDialogoAbandonarNegativo),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                main.mostrarTablero();
                            }
                        }
                );

        return builder.create();
    }
}
