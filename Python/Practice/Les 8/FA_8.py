import xmltodict

def processXML(filename):
    with open(filename) as myXMLFile:
        filecontentstring = myXMLFile.read()
        xmldictionary = xmltodict.parse(filecontentstring)
        return xmldictionary

stationsdict = processXML('stationsFA8.xml')
stations = stationsdict['Stations']['Station']

print('Dit zijn de codes en types van de 4 stations:')
for station in stations:
    code = station['Code']
    type = station['Type']
    print('{} - {}'.format(code,type))

print('\n Dit zijn alle stations met één of meer synoniemen: ')

for station in stations:
    synoniemen = station['Synoniemen']['Synoniem']
    code = station['Code']
    if not synoniemen == None:
        print('{:4} - {}'.format(code,synoniemen))


print('\n Dit is de lange naam van elk station:')

for station in stations:
    code = station['Code']
    lange_naam = station['Namen']['Lang']
    print('{:4} - {}'.format(code,lange_naam))
