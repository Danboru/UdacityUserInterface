package www.eightstudio.id.udacitybasicone;

/**
 * Created by danbo on 11/11/17.
 */

public class Practice {

    private int dataSementara;
    private int dataKedua, dataKetiga;

    public Practice() {
    }

    public Practice(int dataSementara) {
        this.dataSementara = dataSementara;
    }

    public Practice tambahDataDua(int dataKedua) {
        this.dataKedua = dataKedua;
        return this;
    }

    public Practice tambahDataTiga(int dataKetiga) {
        this.dataKetiga = dataKetiga;
        return this;
    }

    public int getDataSementara() {
        return dataSementara;
    }

    public int getDataKedua() {
        return dataKedua;
    }

    public int getDataKetiga() {
        return dataKetiga;
    }

    public Practice build() {
        return new Practice();
    }

}
