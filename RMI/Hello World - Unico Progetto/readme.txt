Necessità di impostare RMIRegistry.
Aprire l'external tools configurations e creare una nuova configurazione.
Impostare nella location la posizione del file rmiregistry.exe:
C:\Program Files (x86)\Java\jre1.8.0_271\bin\rmiregistry.exe
Controllare se la posizione è esatta.
Impostare la working direcoty:
${workspace_loc:/*NOMEDELPROGETTO*/bin}, ovviamente sostituire *NOMEDELPROGETTO* col nome del vostro progetto.
Aggiungere agli argomenti del nostro file HelloImpl:
-Djava.security.policy=policyall