package Competition;

import Competition.exceptions.AgeViolationException;
import Competition.exceptions.DuplicateException;
import Competition.exceptions.MaxCompetitorsException;

class Competition {
    private String name;
    private Participant[] participants;
    private int ageLimit;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        this.ageLimit = ageLimit;
        this.participants = new Participant[maxParticipants];
    }

    void addParticipant(Participant participant) throws AgeViolationException, MaxCompetitorsException, DuplicateException {
        this.validateAgeLimit(participant);
        this.validateParticipantsAmount();
        this.validateParticipantUniqeness(participant);

        participants[size] = participant;
        size++;

    }


    private Exception validateAgeLimit(Participant participant) throws AgeViolationException {
        if (Object.class.isInstance(participant) && participant.getAge() < ageLimit) {
            throw new AgeViolationException("Participant age out of limits!");
        }
        return null;
    }

    private Exception validateParticipantsAmount() throws MaxCompetitorsException {
        if (size >= participants.length) {
            throw  new MaxCompetitorsException("Max amount of participants exceeded!");
        }
        return null;
    }

    private Exception validateParticipantUniqeness(Participant participant) throws DuplicateException {
        for (Participant presentParticipant : participants) {
            if (Object.class.isInstance(participant) && presentParticipant != null) {
                if (presentParticipant.getDocumentId().equals(participant.getDocumentId())) {
                    throw new DuplicateException("Particant already added!");
                }
            }

        }
        return null;
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}