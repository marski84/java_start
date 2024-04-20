package ProgressBar;

public class ProgressBar {
    private double progressCounter = 0;
    private StringBuilder builder = new StringBuilder();

    public void init() throws InterruptedException {
        while (progressCounter <= 100) {
            builder.append("Wczytywanie ");
            builder.append(handleEscapeCharacters(progressCounter));
            builder.append(" " + progressCounter);
            builder.append(handleProgress(progressCounter));
            builder.append("\r");
            builder.toString();
            System.out.print(builder);
            Thread.sleep(200);
            progressCounter += 0.5;
        }
    }

    private String handleEscapeCharacters(double counter) {
        if (progressCounter % 2 == 0) {
            return ("/");
        }
           return ("\\");
    }

    private String handleProgress(double counter) {
        String progressState = "";
        if (counter < 10) {
            progressState = " (          )";
        }
        if (counter / 10 >= 1 && counter / 10 < 2) {
            progressState = " (#         )";
        }
        if (counter / 10 >= 2 && counter / 10 < 3) {
            progressState = " (##        )";
        }
        if (counter / 10 >= 3 && counter / 10 < 4) {
            progressState = " (###       )";
        }
        if (counter / 10 >= 4 && counter / 10 < 5) {
            progressState = " (####      )";
        }
        if (counter / 10 >= 5 && counter / 10 < 6) {
            progressState = " (#####     )";
        }
        if (counter / 10 >= 6 && counter / 10 < 7) {
            progressState = " (######    )";
        }
        if (counter / 10 >= 7 && counter / 10 < 8) {
            progressState = " (#######   )";
        }
        if (counter / 10 >= 8 && counter / 10 < 9) {
            progressState = " (########  )";
        }
        if (counter / 10 >= 9 && counter / 10 < 10) {
            progressState = " (######### )";
        }
        if (counter / 10 == 10) {
            progressState = " (##########)";
        }
        return progressState;
    }
}
