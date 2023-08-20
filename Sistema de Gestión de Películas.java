int release_year;
System.out.println("\nIngrese el título de la película");
title = cn.nextLine();
System.out.println("\nIngrese la descripción");
descripcion = cn.nextLine();
System.out.println("\nIngrese el año de estreno");
release_year = Integer.parseInt(cn.nextLine());
misPeliculas = consultas.agregarPeliculas(title, descripcion, release_year);
cls();
System.out.println("Película agregada correctamente");

int addOne;
do {
    System.out.println("¿Deseas agregar otra? (1-Si | 2-No)");
    addOne = Integer.parseInt(cn.nextLine());
} while (addOne < 1 || addOne > 2);

if (addOne == 1) {
    switchOptionsPeliculas(1, false);
} else {
    switchOptionsPeliculas(printPeliculasMenu(true), false);
}
break;

case 2: // Consultar Película
if (misPeliculas.size() > 0) {
    cls();
    int film_id;
    int countResults = 0;

    do {
        System.out.println("Ingrese el ID de la película a consultar");
        film_id = Integer.parseInt(cn.nextLine());

        for (int i = 0; i <= misPeliculas.size() - 1; i++) {
            if (film_id == misPeliculas.get(i).getFilm_id()) {
                cls();
                System.out.println("---------------------------------");
                misPeliculas.get(i).displayAllInformation();
                countResults++;
                System.out.println("---------------------------------\n");
            }
        }

        if (countResults == 0) {
            cls();
            System.out.println("Película no encontrada...!\n");
        }
    } while (countResults == 0);
} else {
    cls();
    System.out.println("No tienes ninguna película agregada");

    int addOneC;
    do {
        System.out.println("¿Deseas agregar una? (1-Si | 2-No)");
        addOneC = Integer.parseInt(cn.nextLine());
    } while (addOneC < 1 || addOneC > 2);

    if (addOneC == 1) {
        switchOptionsPeliculas(1, false);
    } else {
        switchOptionsPeliculas(printPeliculasMenu(true), false);
    }
}

switchOptionsPeliculas(printPeliculasMenu(false), false);
break;

case 3: // Modificar Película
if (misPeliculas.size() > 0) {
    cls();
    int film_id;
    int countResultsM = 0;

    do {
        System.out.println("Ingrese el ID de la película a modificar");
        film_id = Integer.parseInt(cn.nextLine());

        for (int i = 0; i <= misPeliculas.size() - 1; i++) {
            if (film_id == misPeliculas.get(i).getFilm_id()) {
                String nombreTemporal = misPeliculas.get(i).getTitle();
                System.out.println("\nIngrese el título de la película");
                misPeliculas.get(i).setTitle(cn.nextLine());
                System.out.println("\nIngrese la descripción de la película");
                misPeliculas.get(i).setDescripcion(cn.nextLine());
                System.out.println("\nIngrese el año de estreno");
                misPeliculas.get(i).setReleaseYear(Integer.parseInt(cn.nextLine()));
                countResultsM++;
                consultas.actualizarPeliculas(misPeliculas.get(i).getFilm_id(), misPeliculas.get(i).getTitle(), misPeliculas.get(i).getDescription(), misPeliculas.get(i).getRelease_year());
                cls();
                System.out.println("Información de la película " + nombreTemporal + " ha sido actualizada\n");
                break;
            }
        }

        if (countResultsM == 0) {
            cls();
            System.out.println("Película no encontrada...!\n");
        }
    } while (countResultsM == 0);

    switchOptionsPeliculas(printPeliculasMenu(false), false);
} else {
    cls();
    System.out.println("No tienes ninguna película agregada");

    int addOneM;
    do {
        System.out.println("¿Deseas agregar una? (1-Si | 2-No)");
        addOneM = Integer.parseInt(cn.nextLine());
    } while (addOneM < 1 || addOneM > 2);

    if (addOneM == 1) {
        switchOptionsPeliculas(1, false);
    } else {
        switchOptionsPeliculas(printPeliculasMenu(true), false);
    }
}
break;

case 4: // Eliminar Película
if (misPeliculas.size() > 0) {
    cls();
    int film_id;
    int countResultD = 0;

    do {
        System.out.println("Ingrese el ID de la película a eliminar");
        film_id = Integer.parseInt(cn.nextLine());

        for (int i = 0; i <= misPeliculas.size() - 1; i++) {
            if (film_id == misPeliculas.get(i).getFilm_id()) {
                consultas.eliminarPeliculas(misPeliculas.get(i).getFilm_id());
                misPeliculas.remove(i);
                countResultD++;
                cls();
                System.out.println("Película eliminada\n");
            }
        }

        if (countResultD == 0) {
            cls();
            System.out.println("Película no encontrada...!\n");
        }
    } while (countResultD == 0);
} else {
    cls();
    System.out.println("No tienes ninguna película agregada");

    int addOneE;
    do {
        System.out.println("¿Deseas agregar una? (1-Si | 2-No)");
        addOneE = Integer.parseInt(cn.nextLine());
    } while (addOneE < 1 || addOneE > 2);

    if (addOneE == 1) {
        switchOptionsPeliculas(1, false);
    } else {
        switchOptionsPeliculas(printPeliculasMenu(true), false);
    }
}

switchOptionsPeliculas(printPeliculasMenu(false), false);
break;

case 5: // Consultar Todas las películas
if (misPeliculas.size() > 0) {
    cls();
    System.out.println("-------Todas mis películas-------\n");
    System.out.println("--------------------------------");

    for (int i = 0; i <= misPeliculas.size() - 1; i++) {
        misPeliculas.get(i).displayAllInformation();
        System.out.println("--------------------------------");
    }
} else {
    cls();
    System.out.println("No tienes ninguna película agregada");

    int addOneA;
    do {
        System.out.println("¿Deseas agregar una? (1-Si | 2-No)");
        addOneA = Integer.parseInt(cn.nextLine());
    } while (addOneA < 1 || addOneA > 2);

    if (addOneA == 1) {
        switchOptionsPeliculas(1, false);
    } else {
        switchOptionsPeliculas(printP
    }

    if (addOneA == 1) {
        switchOptionsPeliculas(1, false); // Agregar una película
    } else {
        switchOptionsPeliculas(printPeliculasMenu(true), false);
    }
    System.out.println();
    
    if (!useInOtherModule) {
        switchOptionsPeliculas(printPeliculasMenu(false), false);
    }
    break;
    
    case 6:
        switchOptions(printMenu(true));
        break;
    }
    
    public static int printPeliculasMenu(boolean clean) {
        if (clean) {
            cls();
        }
    
        Scanner cn = new Scanner(System.in);
        int option = 0;
    
        do {
            System.out.println("-----------Peliculas-----------");
            System.out.println("|1-Registrar Pelicula         |");
            System.out.println("|2-Consultar Pelicula         |");
            System.out.println("|3-Modificar Pelicula         |");
            System.out.println("|4-Eliminar Pelicula          |");
            System.out.println("|5-Ver todas las Peliculas    |");
            System.out.println("|6-Salir                     |");
            System.out.println("------------------------------");
    
            if (cn.hasNextInt()) {
                option = Integer.parseInt(cn.nextLine());
    
                if (option < 1 || option > 6) {
                    cls();
                    System.out.println("Opcion no disponible\n");
                }
            } else {
                cls();
                System.out.println("Opcion no disponible\n");
                cn.nextLine();
            }
        } while (option < 1 || option > 6);
    
        return option;
    }
    
    public static void cls() {
        // Código para limpiar la pantalla
    }
    
    public static void initialSettings() {
        misClientes = consultas.getClientes();
        misPeliculas = consultas.getPeliculas();
    }
    Recuerda que este código tiene comentarios de tipo // Código para limpiar la pantalla y // Agregar una película. Asegúrate de llenar esos comentarios con el código real necesario para la funcionalidad correspondiente.
    
    
    
    
    
    

        