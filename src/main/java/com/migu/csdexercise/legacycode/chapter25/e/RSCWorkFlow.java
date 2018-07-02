package com.migu.csdexercise.legacycode.chapter25.e;

public class RSCWorkFlow {
    private static final Integer MAX_LENGTH = 100;

    class Packet {

        String getOriginator() {
            return "";
        }


        Integer getLength() {
            return 0;
        }

        boolean hasValidCheckSum() {
            return false;
        }
    }

    /*public void validate(Packet packet) throws Exception {
        if (packet.getOriginator().equals("MIA")
                || packet.getLength() > MAX_LENGTH
                || !packet.hasValidCheckSum()) {
            throw new Exception();
        }
    }*/

    public void validate(Packet packet) throws Exception {
        validatePacket(packet);
    }

    public static void validatePacket(Packet packet) throws Exception {
        if (packet.getOriginator().equals("MIA")
                || packet.getLength() > MAX_LENGTH
                || !packet.hasValidCheckSum()) {
            throw new Exception();
        }
    }
}
