package no.ntnu.soccer.parser.model;

import com.opencsv.bean.CsvBindByPosition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

public class Player implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Player.class);
    public static final String RESOURCE_CSV_FILE = "players.csv";
    public static final String CSV_DELIMITER = ",";

    // We'll use the API ID (not sequence)
    @CsvBindByPosition(position = 1)
    private int id;

    @CsvBindByPosition(position = 2)
    private String name;

    @CsvBindByPosition(position = 5)
    private double height;

    @CsvBindByPosition(position = 6)
    private double weight;
    private int x;
    private int y;

    public Player() {
        // Empty default constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> childrenFunction) {
        try {
            writer.write(indent() + "<players\n"
                    + indent() + "    id=" + "\""  + id + "\"\n"
                    + indent() + "    name=" + "\""  + name + "\""
            );

            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write(indent() + "</players>\n");
            } else {
                writer.write("/>\n");
            }
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }

    @Override
    public String indent() {
        return "        ";
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
