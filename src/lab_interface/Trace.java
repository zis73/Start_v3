package lab_interface;

import lab_interface.Level.Swimpool;
import lab_interface.Level.Wall;

import java.util.ArrayList;

public class Trace {
    Swimpool swimpool = new Swimpool(9);
    Wall wall = new Wall(14);
    Obstracle[] trace = {swimpool, wall};
}


