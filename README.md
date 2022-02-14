# Patients-Records-in-Hospital
A program for a hospital to welcome a patient, and perform the requested operation by the patient.
 These operations are: 
    1. create a new patient record (operation #1)
    2. query a specific patient (operation #2) 
    3. list all patients recorded in the hospital (operation #3)

In order to perform those operations, 2 classes are created called Patient and Hospital.

Hospital class has the following members:
 a. Patients (Patient array): List of patients recorded in the hospital.

Patint class has the following members:
 a. ID (integer): ID number of the patient
 b. Fullname (string): Name of the patient.
 c. Age (integer): Age of the patient
 d. NumOfVisits (integer): Total of times the patient visited the hospital. Initially, it
    should be 1 for all recorded patients
 e. VisitsPerYear (float): Annual visits of the patient. This is calculated using 
    the formula: visitsPerYear = numOfVisits / age
