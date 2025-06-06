package org.example;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRCStrategy {

    @Override
    public long crcFor(String data) {
        CRC32 crc = new CRC32();
        crc.update(data.getBytes());
        return crc.getValue();
    }
}
