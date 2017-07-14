cijferICOR = 5.5
cijferPROG = 9.1
cijferCSN = 7.0

gemiddelde = (cijferICOR + cijferPROG + cijferCSN)/3

beloning = gemiddelde * 30

overzicht = 'Mijn cijfers (gemiddeld een {}) leveren een beloning van €{} op!'.format(gemiddeld,beloning)

print(overzicht)