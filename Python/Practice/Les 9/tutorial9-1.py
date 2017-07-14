import requests
import xmltodict

auth_details = ('nickwindt@hotmail.nl','CDK6_ROljHU8E3nvIC6NfRMqPqYmuXbsYjDS7JuOY68ULuoInxdF7g')
api_url = 'http://webservices.ns.nl/ns-api-avt?station=wd'
file = 'vertrektijden.xml'
response = requests.get(api_url,auth=auth_details)

vertrekXML = xmltodict.parse(response.text)

with open('vertrektijden.xml','w')as myXMLFile:
    myXMLFile.write(response.text)

print('Dit zijn de vertrekkende treinen:')

for vertrek in vertrekXML['ActueleVertrekTijden']['VertrekkendeTrein']:
    eindbestemming = vertrek['EindBestemming']

    vertrektijd = vertrek['VertrekTijd']
    treinsoort = vertrek['TreinSoort']
    ritnummer = vertrek['RitNummer']
    vertrektijd = vertrektijd[11:16]

    print('Om {} vertrekt een {} (Ritnummer: {} ) naar {}.'.format(vertrektijd,treinsoort,ritnummer,eindbestemming))
